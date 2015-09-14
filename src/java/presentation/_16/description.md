### Domain:

In the web application a lot of user's choices are saved to the database. For example, if user resizes the main panel, the next time they open an application the panel will have exactly the same sizes. `UserSettingsDbSaver` is a class that saves data to the SQL database, while `UserSettingsService` is a class sitting between HTTP endpoint and `UserSettingsDbSaver`. 
