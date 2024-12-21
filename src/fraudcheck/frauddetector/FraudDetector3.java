package fraudcheck.frauddetector;

import fraudcheck.Trader;
import fraudcheck.Transaction;

import java.util.List;

public class FraudDetector3 implements FraudDetector {

    List<String> sitiList = List.of(
            "London","Paris","Omsck","Sydnney"
    );

    @Override
    public boolean isFraudStream(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return sitiList.contains(transaction.getAmount());
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }

}
