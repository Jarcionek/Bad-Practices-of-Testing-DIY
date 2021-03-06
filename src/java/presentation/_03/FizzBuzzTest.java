package presentation._03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static presentation._03.FizzBuzz.fizzBuzz;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        for (int i = 1; i < 100; i++) {
            String result = fizzBuzz(i);
            if (i % 3 == 0) {
                assertEquals("fizz", result);
            } else if (i % 5 == 0) {
                assertEquals("buzz", result);
            } else if (i % 15 == 0) {
                assertEquals("fizzbuzz", result);
            } else {
                assertEquals("" + i, result);
            }
        }
    }

}
