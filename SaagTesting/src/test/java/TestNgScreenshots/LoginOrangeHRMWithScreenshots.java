package TestNgScreenshots;

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

import TestNG.BaseClass;

public class LoginOrangeHRMWithScreenshots extends BaseClass {

	@BeforeSuite
	public void launchBrowser() throws IOException {

		callBrowser("chrome");

		takeScreenshot("launchbrowser.png");

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

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		takeScreenshot("enterUserName.png");

		System.out.println("I am in enterUserName method");

	}

	@Test(priority = 2)
	public void enterPassword() throws IOException {

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		takeScreenshot("enterPassword.png");

		System.out.println("I am in enterPassword method");

	}

	@Test(priority = 3)
	public void clickLogin() throws IOException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		takeScreenshot("afterClickedONLogin.png");

		System.out.println("I am in clickLogin method");

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

/*
 * I am in @BeforeSuite method I am in @BeforeClass method I am in @BeforeMethod
 * method I am in enterUserName method I am in @AfterMethod method I am
 * in @BeforeMethod method I am in enterPassword method I am in @AfterMethod
 * method I am in @BeforeMethod method I am in clickLogin method I am
 * in @AfterMethod method I am in@AfterSuite method
 */
