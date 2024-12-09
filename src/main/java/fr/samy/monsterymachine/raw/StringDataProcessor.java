package fr.samy.monsterymachine.raw;

public class StringDataProcessor implements DataProcessor {
    @Override
    public void process(Object data) {
        if (data instanceof String) {
            System.out.println("Processing string: " + data);
        }
    }

    @Override
    public boolean validate(Object input) {
        return input instanceof String && !((String) input).isEmpty();
    }
}