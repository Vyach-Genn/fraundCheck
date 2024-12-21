package fraudcheck.frauddetector;


import fraudcheck.FraudDetectionResult;
import fraudcheck.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FraudDetectorFinal {

    private List<FraudDetector> rules = List.of(

            new FraudDetector1(),
            new FraudDetector2(),
            new FraudDetector3(),
            new FraudDetector4(),
            new FraudDetector5());


    public FraudDetectionResult isFraudStream(Transaction transaction) {
        return rules.stream()
                .filter(rule -> rule.isFraudStream(transaction))
                .findFirst()
                .map(detector -> new FraudDetectionResult(true, detector.getRuleName()))
                .orElse(new FraudDetectionResult(false, null));

    }


}




