package fr.samy.monsterymachine.refactored_from_raw;

// Interface générique
public interface DataProcessor<T> {
    void process(T data);
    boolean validate(T input);
}