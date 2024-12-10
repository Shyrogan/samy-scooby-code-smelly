package fr.samy.monsterymachine.refactored_from_commented;

public class NumberValidator {
    public boolean isValid(Number data) {
        return data != null && data.doubleValue() >= 0;
    }
}