package presentation._11;

import org.junit.Test;

import static org.junit.Assert.fail;

public class CacheTest {

    private static final String REQUEST = "abc-123";

    private final Cache cache = new Cache();

    @Test
    public void throwsDbErrorWhenValueIsNotCachedAndDbIsDown() {
        try {
            cache.fetch(REQUEST);
            fail();
        } catch (Error expected) {}
    }

    // other tests

}
