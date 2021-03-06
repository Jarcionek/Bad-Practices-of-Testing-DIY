package presentation._14;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StatisticsGeneratorTest {

    private static final int NUMBER_OF_BOOKED_AND_NOT_USED_SEATS = 0;

    private final FlightManager flightManager = mock(FlightManager.class);
    private final DbStatisticsProxy dbStatisticsProxy = mock(DbStatisticsProxy.class);

    private final StatisticsGenerator statisticsGenerator = new StatisticsGenerator(flightManager, dbStatisticsProxy);

    @Test
    public void savesTheNumberOfCustomersWhoMissedTheirFlight() {
        when(flightManager.getBookedUnusedSeats()).thenReturn(NUMBER_OF_BOOKED_AND_NOT_USED_SEATS);

        statisticsGenerator.generateReport();

        verify(dbStatisticsProxy, times(1)).saveNumberOfPeopleWhoMissedTheirFlight(NUMBER_OF_BOOKED_AND_NOT_USED_SEATS);
    }

}
