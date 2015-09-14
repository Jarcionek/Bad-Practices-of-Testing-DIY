### Domain:

Cache works as a proxy to the database. The system is able to work even if database is temporarily unavailable, if only requested data is in the cache. However, if requested data is not in the cache and connection to the database times out, cache is supposed to throw `DbError` which extends `java.lang.Error`. This is a test for this behaviour. Other tests for cache behaviour are not relevant and hence they are not shown.
