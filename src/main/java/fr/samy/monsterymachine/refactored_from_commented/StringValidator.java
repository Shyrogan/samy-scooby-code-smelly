package fr.samy.monsterymachine.refactored_from_commented;

public class StringValidator {
    public boolean isValid(String data) {
        return data != null && !data.trim().isEmpty();
    }
}