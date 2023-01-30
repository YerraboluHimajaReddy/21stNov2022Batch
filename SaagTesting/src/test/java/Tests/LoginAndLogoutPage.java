package Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import TestNG.BaseClass;

public class LoginAndLogoutPage extends BaseClass {
	
	LoginPage lp;
	
	HomePage hp;
	
	LogoutPage lgp;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		callBrowser("chrome");

		takeScreenshot("launchbrowser.png");
		
		lp = new LoginPage(driver);
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
		lgp = PageFactory.initElements(driver, LogoutPage.class);

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
	public void enterUserName() throws IOException {

		lp.enterUsername();

		takeScreenshot("enterUserName.png");

		System.out.println("I am in enterUserName method");

	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		lp.enterPassword("admin123");

		takeScreenshot("enterPassword.png");

		System.out.println("I am in enterPassword method");

	}

	@Test(priority = 3)
	public void clickLogin() throws IOException {

		lp.clickLogin();
		
		takeScreenshot("afterClickedONLogin.png");

		System.out.println("I am in clickLogin method");

	}
	
	@Test(priority = 4)
	public void clickPaul() throws IOException {

		hp.clickPaul();
		
		takeScreenshot("clickPaul.png");

		System.out.println("I am in clickPaul method");

	}

	
	@Test(priority = 5)
	public void clickLogout() throws IOException {

		lgp.clickLogout();
		
		takeScreenshot("clickLogout.png");

		System.out.println("I am in clickLogout method");

	}
	
	@AfterMethod
	public void wait2() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		System.out.println("I am in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() throws IOException {

		takeScreenshot("homepage.png");

		driver.close();

		System.out.println("I am in@AfterSuite method");

	}

}