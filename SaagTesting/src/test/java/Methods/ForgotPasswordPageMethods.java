package Methods;

import org.openqa.selenium.WebDriver;

import Pages.ForgotPasswordPage;

public class ForgotPasswordPageMethods {

	WebDriver driver;
	
	ForgotPasswordPage fp = new ForgotPasswordPage(driver);

	public ForgotPasswordPageMethods(WebDriver driver) {

		this.driver = driver;
	}
	

	public void enterUsername() {

		driver.findElement(fp.username_Textbox).sendKeys("Admin");
	}

	public void clickCancel() {

		driver.findElement(fp.cancel_Button).click();
	}

	public void clickResetPassword() {

		driver.findElement(fp.resetPassword_Button).click();
	}

}
