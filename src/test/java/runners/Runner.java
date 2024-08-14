package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/cenarios.feature",
        glue = "steps",
        plugin = "pretty",
        monochrome = true,
        stepNotifications = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {


}
