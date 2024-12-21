package fraudcheck.frauddetector;


import fraudcheck.Trader;
import fraudcheck.Transaction;

import java.util.List;

public class FraudDetector1 implements FraudDetector {

    List<String> fraudNames = List.of(
            "Pokemon", "Goodvin", "Badvin"
    );

    @Override
    public boolean isFraudStream(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return fraudNames.contains(trader.getFullName());
    }


    @Override
    public String getRuleName() {
        return "FraudRule1";
    }


}
