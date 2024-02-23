package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import objectrepositories.LoginPage;

public class LoginTest extends BaseTest {
     LoginPage lp;
     WebDriver driver;
    @Test()
    public void login() {
		lp = new LoginPage(driver);

        lp.getUsername().sendKeys("reyaz0806");
        lp.getPassword().sendKeys("reyaz123");
        lp.getLoginButton().click();
    }
}