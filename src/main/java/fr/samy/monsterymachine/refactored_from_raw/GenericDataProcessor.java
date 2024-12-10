package fr.samy.monsterymachine.refactored_from_raw;

// Implémentation générique
public class GenericDataProcessor<T> implements DataProcessor<T> {
    @Override
    public void process(T data) {
        if (data != null) {
            System.out.println("Processing " + data);
        }
    }

    @Override
    public boolean validate(T input) {
        return input != null;
    }
}