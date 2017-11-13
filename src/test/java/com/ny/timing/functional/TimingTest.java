package com.ny.timing.functional;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;


public class TimingTest {

    @Test
    public void testTimed() throws Exception {
        final String description = "Contains a goat";

        AtomicReference<String> output = new AtomicReference<>();
        Timing.timed(description, () -> "goat", output::set);

        assert (output.get().contains(description));
    }

}