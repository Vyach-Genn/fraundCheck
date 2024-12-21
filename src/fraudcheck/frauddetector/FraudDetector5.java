package fraudcheck.frauddetector;

import fraudcheck.Trader;
import fraudcheck.Transaction;

import java.util.HashMap;
import java.util.Map;

public class FraudDetector5 implements FraudDetector {

    private final Map<String, Integer> countryAmountMap;

    public FraudDetector5() {
        countryAmountMap = new HashMap<>();
        countryAmountMap.put("Germany", 1000);
        countryAmountMap.put("Italy", 10000);
        countryAmountMap.put("Russia", 100000);
        countryAmountMap.put("Japan", 100);


    }

    @Override
    public boolean isFraudStream(Transaction transaction) {
        Trader trader = transaction.getTrader();
        Integer limit = countryAmountMap.get(trader.getCountry());
        return limit != null && transaction.getAmount() > limit;
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }

}
