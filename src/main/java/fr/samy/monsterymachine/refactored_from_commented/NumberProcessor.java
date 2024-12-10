package fr.samy.monsterymachine.refactored_from_commented;

public class NumberProcessor implements DataProcessor<Number> {
    private final NumberValidator validator;

    public NumberProcessor(NumberValidator validator) {
        this.validator = validator;
    }

    @Override
    public ProcessingResult<Number> process(Number data) {
        if (!validator.isValid(data)) {
            return new ProcessingResult<>(
                    data,
                    ProcessingStatus.VALIDATION_ERROR,
                    "Invalid number data"
            );
        }

        Number processedData = data.doubleValue() * 2; // Example processing
        return new ProcessingResult<>(
                processedData,
                ProcessingStatus.SUCCESS,
                "Number successfully processed"
        );
    }
}