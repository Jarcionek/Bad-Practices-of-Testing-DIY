package presentation._16;

import java.util.Map;

public class UserSettingsService {

    private final UserSettingsSqlDbSaver userSettingsDbSaver;

    public UserSettingsService(UserSettingsSqlDbSaver userSettingsDbSaver) {
        this.userSettingsDbSaver = userSettingsDbSaver;
    }

    public void saveUserSettings(int userId, Map<String, String> settings) {
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            userSettingsDbSaver.save(userId, entry.getKey(), entry.getValue());
        }
    }

}
