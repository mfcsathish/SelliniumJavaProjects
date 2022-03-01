package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FB_Login {
	
	WebDriver driver;
	
 
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	// type jsut recharge url	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	  
  }
  
  
  @Test
  public void f() throws Exception {
	  driver.findElement(By.name("email")).sendKeys("mfc.sathish@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Br439476#");
		
		
		  Thread.sleep(5000);
		  
		driver.findElement(By.name("login")).click();
		
		  Thread.sleep(5000);
	  
	
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
