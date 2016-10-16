package bootstrap;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
		@CucumberOptions(
				plugin = {"html:target/cucumberHtmlReport"},
				//pretty:target/cucumber-json-report.json
				features = "src/main/resources",
				glue = {"glue"
						
				}
		)

	public class RunTest {
	}
