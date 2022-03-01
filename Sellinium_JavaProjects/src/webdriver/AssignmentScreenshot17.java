package webdriver;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class AssignmentScreenshot17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		//get url
		
		driver.get("https://blazedemo.com/");
		
		Thread.sleep(2000);
		
		//select departure city from Dropdown
		
		Select dpcity = new Select(driver.findElement(By.name("fromPort")));
		dpcity.selectByVisibleText("Portland");
		
		Thread.sleep(2000);
		
		//select destination city from Dropdown	
		
		Select dscity = new Select(driver.findElement(By.name("toPort")));
		dscity.selectByVisibleText("London");
		
		//Click Find Flights Button		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();				
		Thread.sleep(5000);
		
		//take screenshot
		//File has selenium class file java.io.file
		//TakesScreenshot has selenium class file
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = ".\\screenshot\\";
		
		
		//Date Code has seleniume class
		
		Date sp = new Date();
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		String timestamp = df.format(sp);
		
		//move abc file to specific location
		
		//FileHandler has selenium class
		
		
		
		FileHandler.copy(abc, new File(path+"test"+timestamp+".png"));
		

		
		
	}

}
