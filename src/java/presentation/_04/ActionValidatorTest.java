package presentation._04;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ActionValidatorTest {

    private final ActionValidator actionValidator = new ActionValidator();

    @Test
    public void testValidator() {
        for (Action action : Action.values()) {
            assertTrue(action.toString(), actionValidator.isValidAction(action.toString()));
        }
    }

}
