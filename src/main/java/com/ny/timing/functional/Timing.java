package com.ny.timing.functional;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Timing {

    public static Double timed(String description, Supplier<Double> supplier, Consumer<String> consumer){

        LocalTime startTime = LocalTime.now();
        Double value = supplier.get();
        LocalTime endTime = LocalTime.now();
        consumer.accept("Time taken to get value from "
                + description + ": " + ChronoUnit.SECONDS.between(startTime, endTime) + " seconds");
        return value;
    }

}
