package chapter_05;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BusinessRuleEngineTest {

    @Test
    public void shouldHaveNoRoulesInitially() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoActions() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addAction(() -> {});
        businessRuleEngine.addAction(() -> {});

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shoouldExecuteAction() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        final Action mockAction = mock(Action.class);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        verify(mockAction).execute();
    }
}