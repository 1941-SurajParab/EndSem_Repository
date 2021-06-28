package invoice;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/feature",glue= {"invoice"},plugin= {"pretty","html:target/Report/Report.html"})

public class runner {

}