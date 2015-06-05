package presentation._09;

public class EventsReceiver {

    private final EventProcessor eventProcessor;
    private final UuidProvider uuidProvider;

    public EventsReceiver(EventProcessor eventProcessor, UuidProvider uuidProvider) {
        this.eventProcessor = eventProcessor;
        this.uuidProvider = uuidProvider;
    }

    public void process(Event... events) {
        String uuid = uuidProvider.nextUuid();
        for (Event event : events) {
            eventProcessor.process(event, uuid);
        }

        // other code
    }

}
