package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public WebDriver driver;

    public loginPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@data-path='sign in']")
    WebElement signIn;

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement continueTo;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement singIn;

    public void clickSignIn(){
        signIn.click();
    }

    public void setUsername(String email){
        username.sendKeys(email);
    }

    public void clickContinue(){
        continueTo.click();
    }

    public void setPassword(String password1){
        password.sendKeys(password1);
    }

    public void clickSignIn2(){
        signIn.click();
    }

}
