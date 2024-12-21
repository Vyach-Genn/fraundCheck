package fraudcheck.frauddetector;

import fraudcheck.Transaction;

public interface FraudDetector {

    boolean isFraudStream(Transaction transaction);

    String getRuleName();
}
