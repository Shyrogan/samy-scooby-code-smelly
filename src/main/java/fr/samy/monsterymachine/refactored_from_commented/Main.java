package fr.samy.monsterymachine.refactored_from_commented;

public class Main {
    public static void main(String[] args) {
        // String processing example
        DataProcessor<String> stringProcessor = new StringProcessor(new StringValidator());
        ProcessingResult<String> stringResult = stringProcessor.process("  hello world  ");
        System.out.println(stringResult.getProcessedData()); // "HELLO WORLD"
        System.out.println(stringResult.getStatus());        // SUCCESS

        // Number processing example
        DataProcessor<Number> numberProcessor = new NumberProcessor(new NumberValidator());
        ProcessingResult<Number> numberResult = numberProcessor.process(42);
        System.out.println(numberResult.getProcessedData()); // 84.0
        System.out.println(numberResult.getStatus());        // SUCCESS
    }
}