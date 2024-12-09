package fr.samy.monsterymachine.raw;

public interface DataProcessor {
    void process(Object data);

    boolean validate(Object input);
}