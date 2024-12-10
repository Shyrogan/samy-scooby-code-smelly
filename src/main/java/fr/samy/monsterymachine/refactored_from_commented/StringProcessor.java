package fr.samy.monsterymachine.refactored_from_commented;

public class StringProcessor implements DataProcessor<String> {
    private final StringValidator validator;

    public StringProcessor(StringValidator validator) {
        this.validator = validator;
    }

    @Override
    public ProcessingResult<String> process(String data) {
        if (!validator.isValid(data)) {
            return new ProcessingResult<>(
                    data,
                    ProcessingStatus.VALIDATION_ERROR,
                    "Invalid string data"
            );
        }

        String processedData = data.trim().toUpperCase();
        return new ProcessingResult<>(
                processedData,
                ProcessingStatus.SUCCESS,
                "String successfully processed"
        );
    }
}
