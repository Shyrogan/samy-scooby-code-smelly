package fr.samy.monsterymachine.commented;

// Another implementation that further demonstrates the interface's lack of clarity
public class StringDataProcessor implements DataProcessor {
    @Override
    public void process(Object data) {
        // This implementation treats data differently, showing how the interface
        // allows inconsistent and confusing implementations
        if (data instanceof String) {
            System.out.println("Processing string: " + data);
        }
    }

    @Override
    public boolean validate(Object input) {
        // Different validation logic, further highlighting the ambiguity
        return input instanceof String && !((String) input).isEmpty();
    }
}