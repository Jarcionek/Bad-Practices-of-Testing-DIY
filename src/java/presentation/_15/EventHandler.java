package presentation._15;

public class EventHandler {

    private final AppActivityReporter appActivityReporter;
    private final UserActivityReporter userActivityReporter;

    public EventHandler(AppActivityReporter appActivityReporter, UserActivityReporter userActivityReporter) {
        this.appActivityReporter = appActivityReporter;
        this.userActivityReporter = userActivityReporter;
    }

    public void handleEvent(Event event) {
        appActivityReporter.report(event.getAppId());
        userActivityReporter.report(event.getAppId());
    }

}
