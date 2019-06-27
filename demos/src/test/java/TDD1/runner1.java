package TDD1;

import org.junit.runner.RunWith;                     

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,plugin={"pretty","json:cucumber-change.json"})
@CucumberOptions(monochrome=true,plugin={"pretty","html:cucumber-report1"})
//@CucumberOptions(monochrome=true,plugin={"pretty","junit:cucumber-report.xml"})
public class runner1 {
	

}
