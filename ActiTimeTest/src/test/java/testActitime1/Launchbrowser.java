package testActitime1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launchbrowser
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-e715h5r/login.do");
		
	}
	
	@Test
	public void login()
	{
		    driver.findElement(By.name("username")).sendKeys("admin");
	 		driver.findElement(By.name("pwd")).sendKeys("manager");
	 		driver.findElement(By.id("loginButton")).click();
	 		
	 		WebElement rc = driver.findElement(By.xpath("//td[.='Enter Time-Track']"));
	 		boolean status = rc.isDisplayed();	
		
	}

	  
    @AfterMethod
    public void teardown()
    {
    	driver.quit();
    }
}

