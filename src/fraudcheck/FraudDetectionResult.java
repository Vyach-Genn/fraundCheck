package fraudcheck;

public class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraudStream() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

}
