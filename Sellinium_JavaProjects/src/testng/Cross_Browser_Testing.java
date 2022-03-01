package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Cross_Browser_Testing {
	
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  
	driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
	Thread.sleep(6000);
	  
  }
  
   @Parameters("browsername")
  @BeforeClass
  public void beforeClass(String browsername) {
	  
	  
	  
	  if (browsername.equalsIgnoreCase("Chrome")){
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 
	  }
			 
			 else if(browsername.equalsIgnoreCase("edge")) {
				 
				 
				 System.setProperty("webdriver.edge.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\msedgedriver.exe");
					
				 driver = new EdgeDriver();
				 
				 
			 }
	  
	  
	 else if(browsername.equalsIgnoreCase("firefox")) {
				 
			
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\geckodriver.exe");
				
		 driver = new FirefoxDriver();
				 
				 
			 }
	  
	 else {
		 
		 System.out.println("Give valid Browser Name");
		 
	 }
		  
		 
	  }
	  		
    
		
	
  }


