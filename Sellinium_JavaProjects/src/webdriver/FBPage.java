package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create webdriver object/Refrence name
		
		WebDriver driver;
		
		//open the chrome browser
		//System.setproperty"key", "location")
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	// type jsut recharge url	
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
	
	//type username and password 
	
	driver.findElement(By.name("txtUserName")).sendKeys("mfc.sathish@gmail.com");
	driver.findElement(By.name("txtPasswd")).sendKeys("Br439476#");
	driver.findElement(By.name("txtCaptcha")).sendKeys("");
	
	
	
	//click on login button
	driver.findElement(By.id("imgbtnSignin")).click();
	

	}

}
