package presentation._10;

import java.util.stream.DoubleStream;

public class StandardDeviationCalculator {

    public double calculate(double... values) {
        double mean = DoubleStream.of(values).average().getAsDouble();
        double variance = DoubleStream.of(values)
                .map(value -> mean - value)
                .map(value -> value * value)
                .average().getAsDouble();
        return Math.sqrt(variance);
    }

}
