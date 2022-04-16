package autoPrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class SauceDemoLogin {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver", 
				"D:\\Downloads_Selenium\\Browser\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		System.out.println("2.Open Edge Browser");
		
		driver.manage().window().maximize();
		System.out.println("3. Mazimise the Browser");
		
		driver.get("https://www.saucedemo.com");
		System.out.println("4. Open URL saucedemo website");
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		System.out.println("5.Enter Username");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		System.out.println("6.Enter Password");
		
		WebElement Button = driver.findElement(By.id("login-button"));
		Button.click();
		System.out.println("7.Click Button");
		
		String ExpectedResult = "https://www.saucedemo.com/inventory.html";
		System.out.println("8.Expected URL is - " + ExpectedResult);
		
		String ActualResult =  driver.getCurrentUrl();
		System.out.println("9.Actual URL is - " + ActualResult);
		
		System.out.println("10.Validation check");
		if(ExpectedResult.equals(ActualResult))
		{
			System.out.println("Test Case is Pass");
		}
		else {
			System.out.println("Test Case is Fail");
		}
	}
}
