package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 public static Properties prop;
	    public static FileInputStream fis;
	    public static WebDriver driver;

	    @BeforeMethod
	    @Parameters("browser")
	    public void setup(String browser) throws IOException {
	        prop = new Properties();
	        fis = new FileInputStream("src\\test\\resources\\property\\config.Properties");
	        prop.load(fis);

	        // Use the browser parameter passed from testng.xml instead of reading from properties file
	        String browserName = browser;

	        if (browserName.equalsIgnoreCase("chrome")) {
	           // WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (browserName.equalsIgnoreCase("firefox")) {
	           // WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        }

	        driver.get(prop.getProperty("url"));
	    }

	   
	
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}
}
