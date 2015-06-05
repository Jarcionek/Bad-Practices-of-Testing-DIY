package presentation._05;

public class ActionValidator {

    public boolean isValidAction(String action) {
        try {
            Action.valueOf(action);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

}
