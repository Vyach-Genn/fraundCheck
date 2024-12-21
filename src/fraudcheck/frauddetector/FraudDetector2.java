package fraudcheck.frauddetector;

import fraudcheck.Transaction;

public class FraudDetector2 implements FraudDetector {

    @Override
    public boolean isFraudStream(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    @Override
    public String getRuleName() {
        return "FraudRule2";
    }
}
