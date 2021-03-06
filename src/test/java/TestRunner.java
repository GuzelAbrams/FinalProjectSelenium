import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //path to your feature file
        features = {"srs/test/resources/feature"},

        //Specify step definition package name. (Note: make sure to have this package on current directory)

        glue = {"StepDefinition", "Drivers"},

        //This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty"},

        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,


        //Specify tags to be executed
        tags = {"@login"},

        //readable console logs
        monochrome = true



)
public class TestRunner {
}
