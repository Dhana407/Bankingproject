package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {
	public WebDriver ldriver;
	public LoginSteps(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(id="txtuId")
	WebElement txtUserName;
	
	@FindBy(id="txtPword")
	WebElement txtPassword;
	
	@FindBy(name="login")
	WebElement btnlogin;
	
	public void setUserName() {
		txtUserName.sendKeys("Admin");
	}
	public void setpassword() {
		txtPassword.sendKeys("Admin");
		
	}
	public void clicklogin() {
		btnlogin.click();
	}

}
