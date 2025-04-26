package adactin_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	WebDriver driver;

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement loginBtn;

	public WebElement getUser() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public LoginPage(WebDriver dri){
		System.out.println("Testing ->"+dri);
		driver=dri;
		PageFactory.initElements(driver, this);
	}

}
