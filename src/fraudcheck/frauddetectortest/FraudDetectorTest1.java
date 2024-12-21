package fraudcheck.frauddetectortest;

import fraudcheck.frauddetector.FraudDetector;
import fraudcheck.frauddetector.FraudDetector1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import fraudcheck.Trader;
import fraudcheck.Transaction;


public class FraudDetectorTest1 {

    FraudDetector detector = new FraudDetector1();
    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(detector.isFraudStream(transaction));
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
        Trader trader = new Trader("Mario", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(detector.isFraudStream(transaction));
    }


}