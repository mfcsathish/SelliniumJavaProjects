package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class College {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup/");
		
		driver.manage().window().maximize();
		
        Thread.sleep(6000);
		
		driver.findElement(By.name("firstName")).sendKeys("Sathish");
		
		driver.findElement(By.name("lastName")).sendKeys("SP");
		
		driver.findElement(By.name("emailAddress")).sendKeys("vanitha511982@gmail.com");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("9894118040");
		
		driver.findElement(By.name("password")).sendKeys("P123456#");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("P123456#");
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("INDIA");
		
		Select type = new Select(driver.findElement(By.name("attendeeType")));
		type.selectByVisibleText("Parent");
		
		Select term = new Select(driver.findElement(By.id("questions[q_134]")));
		term.selectByVisibleText("Spring 2026");
		
		driver.findElement(By.name("questions[q_135]")).click();
		
		driver.findElement(By.name("questions[q_136]")).click();
		
		driver.findElement(By.name("questions[q_137]")).click();
		
		driver.findElement(By.id("submit")).click();
		
		String exp_title = "CollegeWeekLive Registration";
		
		String act_title = driver.getTitle();
		
		System.out.println(act_title);
		
		if (exp_title.equals(act_title) == true)
		{
			System.out.println("Test is passed");
		}
		else 
			
		{
			System.out.println("Test is failed");
			
		}
			
	

	}

}
