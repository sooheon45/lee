package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext483Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext483Application.class })
public class CucumberSpingConfiguration {}
