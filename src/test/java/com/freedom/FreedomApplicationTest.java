package com.freedom;

import com.freedom.hello.FreedomApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
//@ContextConfiguration(classes = FreedomApplication.class, initializers = FreedomApplicationTest.Initializer.class)
@Testcontainers
@SpringBootApplication
public class FreedomApplicationTest {

	public static void main(String[] args) {
		SpringApplication.run(FreedomApplicationTest.class, args);
	}

}
