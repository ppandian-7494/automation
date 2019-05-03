package stepimplementations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjectfactory.BalancePageObjectFactory;

public class BalancePageSteps {
    static WebDriver driver;
    BalancePageObjectFactory balancePageObjectFactory = new BalancePageObjectFactory(driver);

    @Given("^user is on the balance page$")
    public void user_is_on_the_balance_page() throws Throwable {
        System.out.println("\nuser is on the balance page");
        driver = utilities.DriverFactory.open("chrome");
//        driver.get("https://www.exercise1.com/values");
        driver.get("file:///Users/user/code/Automation/iptech/src/resources/data/test.html");
    }

    @Then("^user see all values appear on the screen$")
    public void user_see_all_values_appear_on_the_screen() throws Throwable {
        System.out.println("\nuser see all values appear on the screen");
        balancePageObjectFactory.isAllValuesDisplayed();
    }

    @Then("^user see values are greater than zero$")
    public void user_see_values_are_greater_than_zero() throws Throwable {
        System.out.println("\nuser see values are greater than zero");
        balancePageObjectFactory.isAllValuesGreaterthanZero();
    }

    @Then("^user see total balance is sum of all values$")
    public void user_see_total_balance_is_sum_of_all_values() throws Throwable {
        System.out.println("\nuser see total balance is sum of all values");
        balancePageObjectFactory.isTotalBalanceValid();

    }

    @Then("^user see values are formatted as currencies$")
    public void user_see_values_are_formatted_as_currencies() throws Throwable {
        System.out.println("\nuser see values are formatted as currencies");
        balancePageObjectFactory.isAllValuesinCurrency();
    }

    @Then("^user close the balance page$")
    public void user_close_the_balance_page() throws Throwable {
        System.out.println("\nuser close the balance page");
        utilities.DriverFactory.close(driver);
    }
}
