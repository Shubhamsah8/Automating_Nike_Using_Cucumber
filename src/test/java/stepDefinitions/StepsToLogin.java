package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.loginPage;

public class StepsToLogin {

    public WebDriver driver;
    public loginPage lp;
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        driver = new ChromeDriver();

        lp = new loginPage();
    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }
    @When("User enters Email as {string} and click on Continue")
    public void user_enters_email_as_and_click_on_continue(String username) {
        lp.clickSignIn();
        lp.setUsername(username);
        lp.clickContinue();
    }
    @When("User enters Password as {string} and Click on SignIn")
    public void user_enters_password_as_and_click_on_sign_in(String password) {
        lp.setPassword(password);
        lp.clickSignIn2();
    }
    @Then("I should see the homepage of the Website")
    public void i_should_see_the_homepage_of_the_website() {
    }
    @Then("close Browser")
    public void close_browser() {
        driver.quit();
    }
}
