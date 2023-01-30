package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage {

	WebDriver driver;

	public LogoutPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[text()='About']")
	private WebElement clickAbout;
	
	@FindBy(xpath = "//a[text()='Support']")
	private WebElement clickSupport;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement clickChangePassword;
	
	@CacheLookup
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement clickLogout;	
	
	public void clickLogout() {

		clickLogout.click();
	}	
	
	public void clickSupport() {

		clickSupport.click();
	}	
	
	public void clickAbout() {

		clickAbout.click();
	}	
	
	public void clickChangePassword() {

		clickChangePassword.click();
	}

}
