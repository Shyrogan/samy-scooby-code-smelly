package fr.samy.monsterymachine.refactored_from_commented;

// DataProcessor.java
/**
 * Generic interface for processing data of a specific type
 * @param <T> the type of data to process
 */
public interface DataProcessor<T> {
    /**
     * Processes the input data according to specific business rules
     * @param data the data to process
     * @return the processed result
     * @throws IllegalArgumentException if the data is invalid
     */
    ProcessingResult<T> process(T data);
}
