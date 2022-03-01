package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tirupatibalaji {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
       // System.setProperty("webdriver.edge.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\msedgedriver.exe");
		
		//driver = new EdgeDriver();
		
		 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\geckodriver.exe");
			
			//driver = new FirefoxDriver();
		
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(6000);
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//fName
		
		driver.findElement(By.name("fName")).sendKeys("Lakshitha");
		
		//lName
		
		driver.findElement(By.name("lName")).sendKeys("Abhinav");
		
		//mobNo
		
		driver.findElement(By.name("mobNo")).sendKeys("9894118040");
		
		//gender by xpath
		
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		
		//address1
		
		driver.findElement(By.name("address1")).sendKeys("1036 Nehru Nagar");
		
		//address2
		
		driver.findElement(By.name("address2")).sendKeys("Medical college Road");
		
		//cityS
		
		driver.findElement(By.name("cityS")).sendKeys("Tanjore");
		
		Select country = new Select(driver.findElement(By.name("countryS")));
		country.selectByVisibleText("India");
		
		//stateS
		
		Select state = new Select(driver.findElement(By.name("stateS")));
		state.selectByVisibleText("Tamil Nadu");
		
		Select proof = new Select(driver.findElement(By.name("proofS")));
		proof.selectByVisibleText("Passport");
		
		//proofId
		
		driver.findElement(By.name("proofId")).sendKeys("G5220233R");
		
		//emailId
		
		driver.findElement(By.name("emailId")).sendKeys("mfc.sathish@gmail.com");
		
		//password
		
		driver.findElement(By.name("password")).sendKeys("P123456#");
		
		//repassword
		
		driver.findElement(By.name("repassword")).sendKeys("P123456#");

	}

}
