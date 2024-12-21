package fraudcheck.frauddetectortest;

import fraudcheck.frauddetector.FraudDetector;
import fraudcheck.frauddetector.FraudDetector2;
import fraudcheck.Trader;
import fraudcheck.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FraudDetectorTest2 {

    FraudDetector detector = new FraudDetector2();

    @Test
    public void checkMoreTheMaximumDeposit() {
        Trader trader = new Trader("Zooro", "Rome");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(detector.isFraudStream(transaction));
    }

    @Test
    public void chechLessTheMaximumDeposit() {
        Trader trader = new Trader("Zooro", "Rome");
        Transaction transaction = new Transaction(trader, 999999);
        assertFalse(detector.isFraudStream(transaction));
    }



}
