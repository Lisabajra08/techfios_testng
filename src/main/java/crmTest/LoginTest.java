package crmTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		invalidLoginTest();
		tearDown();
		
	}
	
	public static void launchBrowser() {
		//launching the website 
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		//maximizes the windows
		driver.manage().window().maximize();
	}
	
	public static void loginTest() throws InterruptedException {
		//identifying username and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identifying the password and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identifying the sign in button and click
		driver.findElement(By.name("login")).click();
		//stops the code execution for 2 seconds
		Thread.sleep(2000);
	}
	
	public static void invalidLoginTest() throws InterruptedException {
		//identifying username and pass the value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identifying the password and pass the value
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identifying the sign in button and click
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
	}
	
	public static void tearDown() {
		//close the browser
		driver.close();
	}

}
