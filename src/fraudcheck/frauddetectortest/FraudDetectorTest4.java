package fraudcheck.frauddetectortest;

import fraudcheck.frauddetector.FraudDetector;
import fraudcheck.frauddetector.FraudDetector4;
import fraudcheck.Trader;
import fraudcheck.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest4 {

    FraudDetector detector = new FraudDetector4();

    @Test
    public void checkingTransactionFromFraudulentCountry() {
        Trader trader = new Trader("Jon", "Rome", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(detector.isFraudStream(transaction));
    }

    @Test
    public void checkingTransactionFromNonFraudulentCountry() {
        Trader trader = new Trader("Jon", "Rome", "United States");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(detector.isFraudStream(transaction));

    }


}



