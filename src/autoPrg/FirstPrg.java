package autoPrg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstPrg {
	public static void main(String[] args) {
//Chrome-Driver 
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Downloads_Selenium\\Browser\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.flipkart.com");
		
//Microsoft-edge Driver		
		System.setProperty("webdriver.edge.driver", 
				"D:\\Downloads_Selenium\\Browser\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		
//firefox-(gecko) Driver
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Downloads_Selenium\\Browser\\geckodriver.exe");
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://soapui.com");
		System.out.println("Url is open");
		
	}
}
