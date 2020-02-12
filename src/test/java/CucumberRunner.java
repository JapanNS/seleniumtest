import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/default-cucumber-reports"},
        features = {"classpath:features"},
        glue= {"step_defs"},
       // tags = "@expedia",
        dryRun = false)
public class CucumberRunner {

}
