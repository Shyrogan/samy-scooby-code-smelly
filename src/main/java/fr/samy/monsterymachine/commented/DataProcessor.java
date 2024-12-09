package fr.samy.monsterymachine.commented;

// An example of an ambiguous and overly generic interface
public interface DataProcessor {
    // This method is too vague and can mean many different things
    // ISSUE: Ambiguous method signature that lacks clear purpose
    void process(Object data);

    // Another ambiguous method with unclear responsibilities
    // ISSUE: No context about what "validate" means or what constitutes valid data
    boolean validate(Object input);
}