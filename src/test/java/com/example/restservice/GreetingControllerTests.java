package com.example.restservice;

import org.junit.jupiter.api.Test;

public class GreetingControllerTests {

    @Test
    void greeting_returns_name_passed_in() {
        String template = "Hello, %s";
        String name = "Tupac Shakur";
        String expectedContent = String.format(template, name);

        GreetingController greetingController = new GreetingController();
        Greeting retVal = greetingController.greeting(name);
        assert retVal.content().equals(expectedContent);
    }

    @Test
    void greeting_counter_increments() {
        GreetingController greetingController = new GreetingController();
        Greeting retVal1 = greetingController.greeting("");
        long firstCounterValue = retVal1.id();
        Greeting retVal2 = greetingController.greeting("");
        long secondCounterValue = retVal2.id();
        assert secondCounterValue == firstCounterValue + 1;
    }
}
