package presentation._05;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class EventProcessorTest {

    private final Logger logger = mock(Logger.class);

    private final EventProcessor eventProcessor = new EventProcessor(logger);

    @Test
    public void doesNotLogEventIfDebugIsOff() {
        eventProcessor.process(new Event("eventText"));

        verify(logger, never()).log("eventText");
    }

    @Test
    public void logsEventIfDebugIsOn() {
        System.setProperty("debug", "enabled");

        eventProcessor.process(new Event("eventText"));

        verify(logger, times(1)).log("eventText");
    }

    // some other tests

}
