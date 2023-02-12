package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/* tells Spring Boot to look for a main configuration class (one with @SpringBootApplication, for instance)
 and use that to start a Spring application context.*/
@SpringBootTest
class RestServiceApplicationTests {

	@Test
	void contextLoads() {
        /* Empty contextLoads() is a test to verify if the application
         is able to load Spring context successfully or not. */
	}

}
