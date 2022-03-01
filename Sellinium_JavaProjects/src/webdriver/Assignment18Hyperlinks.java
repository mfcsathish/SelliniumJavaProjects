package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18Hyperlinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish SP\\Desktop\\Workspace\\Sellinium_JavaProjects\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		//get url
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000);
		
		//List and webelement selenium clas
		
		List<WebElement> allhyperlinks =  driver.findElements(By.tagName("a"));
		System.out.println("Number of links : "+allhyperlinks.size());
		
		//to print all hyperlinks use for each
		
		for (WebElement hpl : allhyperlinks) {
			
			System.out.println(hpl.getText());
		}

	}

}
