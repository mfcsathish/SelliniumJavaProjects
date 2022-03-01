package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRecharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
				driver = new ChromeDriver();
				
				driver.get("https://www.justrechargeit.com/");
				
				driver.get("https://www.justrechargeit.com/SignUp.aspx");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.name("signup_name")).sendKeys("SathishSp");
				//signup_mobileno
				driver.findElement(By.name("signup_mobileno")).sendKeys("7397129554");
				//signup_email
				driver.findElement(By.name("signup_email")).sendKeys("sathish.kumar@montessori.edu.sg");
				//signup_password
				driver.findElement(By.name("signup_password")).sendKeys("123456#");
				//checkbox
				driver.findElement(By.id("checkbox")).click();
				//imgbtnSubmit
				driver.findElement(By.name("imgbtnSubmit")).click();
				
				String exp_title = "My Account :: Recharge any Mobile, any DTH on JustRechargeIt";
				
				String act_title = driver.getTitle();
				
				System.out.println(act_title);
				
				if (exp_title.equals(act_title) == true)
				{
					System.out.println("Test is Passed");
				}
				else
				{
					System.out.println("Test is failed");
				}
				
				
	}

}
