package presentation._15;

public class Event {

    private final int appId;
    private final int userId;

    public Event(int appId, int userId) {
        this.appId = appId;
        this.userId = userId;
    }

    public int getAppId() {
        return appId;
    }

    public int getUserId() {
        return userId;
    }

}
