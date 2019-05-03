package cucumbertests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/user/code/Automation/iptech/src/resources/features/balance.feature",glue="stepimplementations")
public class BalanceTestRunner {

}
