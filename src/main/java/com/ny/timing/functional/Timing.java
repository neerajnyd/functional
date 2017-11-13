package com.ny.timing.functional;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Timing {

    public static <T> T timed(String description, Supplier<T> supplier, Consumer<String> consumer){

        LocalTime startTime = LocalTime.now();
        T value = supplier.get();
        LocalTime endTime = LocalTime.now();
        consumer.accept("Time taken to get value from "
                + description + ": " + ChronoUnit.SECONDS.between(startTime, endTime) + " seconds");
        return value;
    }

}
