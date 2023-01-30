package TestNgAttributes;

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

public class Description_Attribute extends BaseClass {	
	
	@BeforeSuite
	public void launchBrowser() {
		
	    callBrowser("edge");
	    	       
	    System.out.println("I am in @BeforeSuite method");
	}
	
	@BeforeClass
	public void launchURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();		
		
	    System.out.println("I am in @BeforeClass method");

	}
	
	@BeforeMethod
	public void wait1() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	    System.out.println("I am in @BeforeMethod method");

	}
	
	@Test(priority = 1, description = " This method is used to enter username ")
	public void enterUserName() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    System.out.println("I am in enterUserName method");

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    System.out.println("I am in enterPassword method");

	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("I am in clickLogin method");

	}
	
	
	@AfterMethod
	public void wait2() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    System.out.println("I am in @AfterMethod method");

	}	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.close();
	    System.out.println("I am in@AfterSuite method");

	}

}

/* I am in @BeforeSuite method
I am in @BeforeClass method
I am in @BeforeMethod method
I am in enterUserName method
I am in @AfterMethod method
I am in @BeforeMethod method
I am in enterPassword method
I am in @AfterMethod method
I am in @BeforeMethod method
I am in clickLogin method
I am in @AfterMethod method
I am in@AfterSuite method
*/
