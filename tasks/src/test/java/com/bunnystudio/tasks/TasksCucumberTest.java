package com.bunnystudio.tasks;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(Cucumber.class)
@CucumberOptions(
	glue = {"com.bunnystudio.tasks"}, 
	plugin = { "pretty" }, strict = true, 
	features = { "src/test/resources" })
public class TasksCucumberTest {

}
