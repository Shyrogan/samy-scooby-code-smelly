package fr.samy.monsterymachine.refactored_from_raw;

public class Main {
    public static void main(String[] args) {
        // Utilisation avec type spécifique
        DataProcessor<String> stringProcessor = new StringDataProcessor();
        stringProcessor.process("Hello");

        // Utilisation avec type générique
        DataProcessor<Object> genericProcessor = new GenericDataProcessor<>();
        genericProcessor.process("Some data");
        genericProcessor.process(42);
    }
}