package fr.samy.monsterymachine.refactored_from_raw;

// Implémentation spécifique pour les String
public class StringDataProcessor implements DataProcessor<String> {
    @Override
    public void process(String data) {
        System.out.println("Processing string: " + data);
    }

    @Override
    public boolean validate(String input) {
        return input != null && !input.isEmpty();
    }
}