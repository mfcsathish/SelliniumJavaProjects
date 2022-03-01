package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FB_Grouping_in_Testng {
	
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
	
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws Exception {
	  
	  
	  driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);		  
		driver.findElement(By.name("login")).click();
		
		  Thread.sleep(5000);
	  	  
  }


  @Test(dataProvider = "ap")
  public void g(String username, String password) throws Exception {
	  
	  
	  driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);		  
		driver.findElement(By.name("login")).click();
		
		  Thread.sleep(5000);
	  	  
  }
  
  
  @Test(dataProvider = "abc")
  public void k(String username, String password) throws Exception {
	  
	  
	  driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);		  
		driver.findElement(By.name("login")).click();
		
		  Thread.sleep(5000);
	  	  
  }

  @DataProvider
  public Object[][] ap() {
    return new Object[][] {
    	 new Object[] { "ygigijbkj.co", "Br439476" },
         new Object[] { "ydytdytytt.com", "Br439476" },
         new Object[] { "yrycfuygiug.com", "Br439476" },
    };
  }

  
  @DataProvider
  public Object[][] abc() {
    return new Object[][] {
    	 new Object[] { "vhjqvsch.co", "Br439476" },
         new Object[] { "cjdwchebw.com", "Br439476" },
         new Object[] { "cenwjncjewn.com", "Br439476" },
    };
  }


  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
