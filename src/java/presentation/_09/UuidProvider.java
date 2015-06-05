package presentation._09;

public interface UuidProvider {

    /**
     * Returns new universally unique identifier. It is guaranteed that returned value
     * is different than last 1000 previously returned values.
     */
    String nextUuid();

}
