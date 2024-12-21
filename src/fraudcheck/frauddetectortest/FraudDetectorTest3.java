package fraudcheck.frauddetectortest;

import fraudcheck.frauddetector.FraudDetector;
import fraudcheck.frauddetector.FraudDetector3;
import fraudcheck.Trader;
import fraudcheck.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest3 {

    FraudDetector detector = new FraudDetector3();

    @Test
    public void checkingTransactionFromFraudulentCity() {
        Trader trader = new Trader("Edi", "Sydnney");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(detector.isFraudStream(transaction));
    }

    @Test
    public void checkingTransactionFromNonFraudulentCity() {
        Trader trader = new Trader("Edi", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(detector.isFraudStream(transaction));
    }


}
