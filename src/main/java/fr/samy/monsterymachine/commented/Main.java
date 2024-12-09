package fr.samy.monsterymachine.commented;

public class Main {
    public static void main(String[] args) {
        // ISSUE: It's unclear what kind of data should be processed
        // Different implementations might expect completely different types
        DataProcessor genericProcessor = new GenericDataProcessor();
        DataProcessor stringProcessor = new StringDataProcessor();

        // These calls could behave very differently or have unpredictable results
        genericProcessor.process("Some data");
        genericProcessor.process(42);

        stringProcessor.process("Hello");
        // stringProcessor.process(42); // This might cause unexpected behavior
    }
}