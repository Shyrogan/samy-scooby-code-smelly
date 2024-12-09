package fr.samy.monsterymachine.commented;

// Problematic implementation that highlights the interface's ambiguity
public class GenericDataProcessor implements DataProcessor {
    @Override
    public void process(Object data) {
        // ISSUE: The implementation is entirely unclear about what processing means
        // Could this be data transformation? Filtering? Storage? Logging?
        if (data != null) {
            System.out.println("Processing " + data);
        }
    }

    @Override
    public boolean validate(Object input) {
        // ISSUE: Validation is extremely arbitrary and meaningless
        // What are the actual validation criteria?
        return input != null;
    }
}