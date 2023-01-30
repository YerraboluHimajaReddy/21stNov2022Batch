package TestNG;

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

public class FirstClassInTestNG {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		
	    driver = new ChromeDriver();
	    
	    System.out.println("I am in @BeforeSuite method");
	}
	
	@BeforeClass
	public void launchURL() {
		
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();		
		
	    System.out.println("I am in @BeforeClass method");

	}
	
	@BeforeMethod
	public void wait1() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	    System.out.println("I am in @BeforeMethod method");

	}
	
	@Test(priority = 1)
	public void enterTextToTheWikipedia() {
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Nandhini");
	}
	
	@Test(priority = 2)
	public void clickDate() {
		
		driver.findElement(By.id("datepicker")).click();
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
