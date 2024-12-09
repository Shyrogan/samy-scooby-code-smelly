package fr.samy.monsterymachine.raw;

public class GenericDataProcessor implements DataProcessor {
    @Override
    public void process(Object data) {
        if (data != null) {
            System.out.println("Processing " + data);
        }
    }

    @Override
    public boolean validate(Object input) {
        return input != null;
    }
}