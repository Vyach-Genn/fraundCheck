package fraudcheck.frauddetector;

import fraudcheck.Trader;
import fraudcheck.Transaction;

import java.util.List;

public class FraudDetector4 implements FraudDetector {

    List<String> countryList = List.of(
            "USA","Kanada","Jamaica"
    );

    @Override
    public boolean isFraudStream(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return countryList.contains(trader.getCountry());
    }

    @Override
    public String getRuleName() {
        return "FraudRule4";
    }

}
