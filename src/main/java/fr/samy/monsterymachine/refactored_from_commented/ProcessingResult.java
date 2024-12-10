package fr.samy.monsterymachine.refactored_from_commented;

/**
 * Represents the result of a data processing operation
 * @param <T> the type of processed data
 */
public class ProcessingResult<T> {
    private final T processedData;
    private final ProcessingStatus status;
    private final String message;

    public ProcessingResult(T processedData, ProcessingStatus status, String message) {
        this.processedData = processedData;
        this.status = status;
        this.message = message;
    }

    public T getProcessedData() {
        return processedData;
    }

    public ProcessingStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
