package fr.samy.monsterymachine.raw;


public class Main {
    public static void main(String[] args) {
        DataProcessor genericProcessor = new GenericDataProcessor();
        DataProcessor stringProcessor = new StringDataProcessor();

        genericProcessor.process("Some data");
        genericProcessor.process(42);

        stringProcessor.process("Hello");
    }
}