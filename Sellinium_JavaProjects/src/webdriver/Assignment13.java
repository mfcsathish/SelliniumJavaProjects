package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
	
		
	// Get CurrentUrl
		
	driver.get("https://www.justrechargeit.com");
	String curl = driver.getCurrentUrl();
	System.out.println(curl);
	
	// Get Title
	
		String tit = driver.getTitle();
		System.out.println(tit);
		
		//click create account id = signup-link9
		
		driver.findElement(By.id("signup-link9")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("imgbtnSubmit")).click();
		
		// Get error msg
		
		String gtxt = driver.findElement(By.id("nameTD")).getText();
		System.out.println("get error msg : " +gtxt );
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
				
		driver.navigate().forward();
			
		
		
		

	}

}
