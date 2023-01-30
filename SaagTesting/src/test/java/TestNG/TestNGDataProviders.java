package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviders extends BaseClass {	
	
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
	
	@DataProvider(name = "test")
	public Object[][] getData(){
		
		Object[][] values = new Object[3][2];
		
		values[0][0]="Jyothi"; 
		values[0][1]="Jyothi@123"; 
		
		values[1][0]="Ishnavi"; 
		values[1][1]="Ishnavi@123"; 
		
		values[2][0]="Testing"; 
		values[2][1]="Testing@123"; 
		
		return values;
	}
	
	
	@Test(dataProvider = "test")
	public void enterCredentials(String Username, String password) {
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
	    		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
	    System.out.println("I am in enterCredentials method");

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
