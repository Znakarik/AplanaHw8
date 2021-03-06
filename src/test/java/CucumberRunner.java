import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        glue = "steps",
        plugin = {"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm", "pretty", "json:target/cucumber-report/report.json"},
        features = "./src/test/resources/features/test.feature"
)
@RunWith(Cucumber.class)
public class CucumberRunner {

}
