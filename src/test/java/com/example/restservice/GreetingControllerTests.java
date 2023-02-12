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
}
