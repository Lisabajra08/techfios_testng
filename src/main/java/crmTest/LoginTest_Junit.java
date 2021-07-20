package crmTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	 WebDriver driver;

	@Before
	public void launchBrowser() {
		//setting the chromedriver properties
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		//making the connection between the driver and the chrome driver
		driver=new ChromeDriver();
		
		//driver.get means to go to a specific url
		driver.get("https://techfios.com/billing/?ng=admin/");
		//maximizes the windows
		driver.manage().window().maximize();
		//to delete the cookies
		driver.manage().deleteAllCookies();
		//to implicitlywait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	//for identifying a certain element we are using findelement
	//for typing in the element we are using the sendkeys.
	
	@Test
	public void loginTest() throws InterruptedException {
		//identifying username and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identifying the password and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identifying the sign in button and click
		driver.findElement(By.name("login")).click();
		//stops the code execution for 2 seconds
		Thread.sleep(2000);
	}
	
	@Test
	public void invalidLoginTest() throws InterruptedException {
		//identifying username and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identifying the password and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identifying the sign in button and click
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() {
		//close the browser
		driver.close();
	}
}
