package objectrepositories;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	

	public class LoginPage {
	    
	    WebDriver driver;
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    
	    @FindBy(xpath="//input[@name='username']")
	    WebElement usernameElement;
	    
	    public WebElement getUsername() {
	        return usernameElement;
	    }
	    
	    @FindBy(xpath="//input[@name='password']")
	    WebElement passwordElement;
	    
	    public WebElement getPassword() {
	        return passwordElement;
	    }
	    @FindBy(xpath="//input[@name='login']")
	    private WebElement loginButton;
	    
	    public WebElement getLoginButton() {
	        return loginButton;
	    }
	}


