package feature.manualRunner;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:junitResult.xml"},
                 features = "src/test/resources/feature/manualRunner")
public class ManualRunnerTest {

}
