### Domain:

Airlines have a system to create and store statistics about their flights, customers, income and so on. After each flight (after crew reports that all passengers have been checked out) the system calls `StatisticsGenerator` that takes from `FlightManager` all data required for the report and saves them to the database using `DbStatisticsProxy`. One of the values the report contains is how many people bought a ticket but did not use it.
