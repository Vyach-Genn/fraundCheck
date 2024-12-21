package fraudcheck.frauddetectortest;

import fraudcheck.frauddetector.FraudDetector;
import fraudcheck.frauddetector.FraudDetector5;
import fraudcheck.Trader;
import fraudcheck.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudDetectorTest5 {

    FraudDetector detector = new FraudDetector5();

    @Test
    public void checkingTransactionMore1000FromFraudulentCountry() {
        Trader trader = new Trader("Jon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(detector.isFraudStream(transaction));
    }

    @Test
    public void checkingTransactionFromNotFraudulentCountry() {
        Trader trader = new Trader("Jon", "Paris", "France");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(detector.isFraudStream(transaction));
    }

    @Test
    public void checkingTransactionMoreTheMax() {
        Trader trader = new Trader("Jon", "Paris", "France");
        Transaction transaction = new Transaction(trader, 1001);
        assertFalse(detector.isFraudStream(transaction));
    }

    @Test
    public void checkingTransactionLesse1000FromFraudulentCountry() {
        Trader trader = new Trader("Jon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(detector.isFraudStream(transaction));
    }
}
