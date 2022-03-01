package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
       // System.setProperty("webdriver.edge.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\msedgedriver.exe");
		
		//driver = new EdgeDriver();
		
		 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\geckodriver.exe");
			
			//driver = new FirefoxDriver();
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(6000);
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select dcity = new Select(driver.findElement(By.name("fromPort")));
		dcity.selectByVisibleText("Portland");
		
		Select tcity = new Select(driver.findElement(By.name("toPort")));
		tcity.selectByVisibleText("New York");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String gtext = driver.findElement(By.xpath("/html/body/div[2]/h3")).getText();
		System.out.println("Flight Schedule :" +gtext );
		
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.findElement(By.xpath("//*[@id='inputName']")).sendKeys("Abhinav Lakshitha");
		
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys("n0 1036 nehru nagar");		

		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Tanjore");
		
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Tamil Nadu");
		
		driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys("620013");
		
		driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys("620013");
		
		Select ctype = new Select(driver.findElement(By.xpath("//*[@id='cardType']")));
		ctype.selectByVisibleText("American Express");
		
		driver.findElement(By.xpath("//*[@id='creditCardNumber']")).sendKeys("12345678901234567890");
		
		driver.findElement(By.xpath("//*[@id='creditCardMonth']")).sendKeys("12");
		
		driver.findElement(By.xpath("//*[@id='creditCardYear']")).sendKeys("2021");
		
		driver.findElement(By.xpath("//*[@id='nameOnCard']")).sendKeys("Vanitha");
		
		driver.findElement(By.xpath("//*[@id='rememberMe']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String ftext = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println("Thanks Messsage :" +ftext );
		
		String idtext = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
		String idno = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
		
		System.out.println("Customer " +idtext + " : " +idno );
		

	}

}
