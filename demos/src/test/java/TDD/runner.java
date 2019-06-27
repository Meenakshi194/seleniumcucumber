package TDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,plugin={"pretty","json:cucumber-report.json"})
//@CucumberOptions(monochrome=true,plugin={"pretty","html:cucumber-report"})
//@CucumberOptions(monochrome=true,plugin={"pretty","junit:cucumber-report.xml"})
@CucumberOptions(monochrome=true,tags={"@smoke","@tag"})
public class runner {
	

}
