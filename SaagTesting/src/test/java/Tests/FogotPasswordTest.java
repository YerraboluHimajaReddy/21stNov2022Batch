package Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.ForgotPasswordPageMethods;
import Pages.LoginPage;
import TestNG.BaseClass;

public class FogotPasswordTest extends BaseClass {
	
	LoginPage lp;
	
	ForgotPasswordPageMethods fpm; 

	@BeforeSuite
	public void launchBrowser() throws IOException {

		callBrowser("chrome");

		takeScreenshot("launchbrowser.png");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotPasswordPageMethods(driver);

		System.out.println("I am in @BeforeSuite method");
	}

	@BeforeClass
	public void launchURL() throws IOException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		takeScreenshot("launchURL.png");

		System.out.println("I am in @BeforeClass method");

	}

	@BeforeMethod
	public void wait1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		System.out.println("I am in @BeforeMethod method");

	}

	@Test(priority = 1)
	public void clickForgotYourPassword() throws IOException {

		lp.clickForgotYourPassword();

		takeScreenshot("ForgotPasswordPageMethods.png");

		System.out.println("I am in ForgotPasswordPageMethods method");

	}

	@Test(priority = 2)
	public void enterusername() throws IOException {

		fpm.enterUsername();

		takeScreenshot("enterusername.png");

		System.out.println("I am in enterusername method");

	}

	@Test(priority = 3)
	public void clickCancel() throws IOException {

		fpm.clickCancel();
		
		takeScreenshot("clickCancel.png");

		System.out.println("I am in clickCancel method");

	}

	@AfterMethod
	public void wait2() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		System.out.println("I am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {

		takeScreenshot("homepage.png");

		//driver.close();

		System.out.println("I am in@AfterSuite method");

	}

}