package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.findElement(By.name("email")).sendKeys("sachu611@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("password")).sendKeys("Br439476#"); 
		
		driver.findElement(By.id("signInSubmit")).click();
		
		String exp_title ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		String act_title = driver.getTitle();
		
		if(exp_title.equals(act_title)==true)
		
		{			
			System.out.println("Test case is Passed");
		}
		else
		{			
			System.out.println("Test case is failed");
		}
		
		

	}

}
