package presentation._14;

public class StatisticsGenerator {

    private final FlightManager flightManager;
    private final DbStatisticsProxy dbStatisticsProxy;

    public StatisticsGenerator(FlightManager flightManager, DbStatisticsProxy dbStatisticsProxy) {
        this.flightManager = flightManager;
        this.dbStatisticsProxy = dbStatisticsProxy;
    }

    public void generateReport() {
        dbStatisticsProxy.saveNumberOfPeopleWhoMissedTheirFlight(0);
    }

}
