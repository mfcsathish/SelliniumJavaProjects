package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlert16 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		//get url
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		//click the clickme button
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);
		
		//get alert text
		
		String alttext = driver.switchTo().alert().getText();
		
		System.out.println("Get Alert text : "+alttext);
		
		driver.switchTo().alert().accept();
		
		//Click second timerAlertButton
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		Thread.sleep(5000);
		
		String timealttext = driver.switchTo().alert().getText();
		
		System.out.println("Get Alert text : "+timealttext);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		// Click confirmButton 
		
	    driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(3000);
		
	   String confirmtext = driver.switchTo().alert().getText();
		
		System.out.println("Get Alert text : "+confirmtext);	
		
		Thread.sleep(3000);
				
		driver.switchTo().alert().dismiss();
				
			System.out.println("You selected Cancel");
		
		

	}

}
