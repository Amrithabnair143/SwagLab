package basicPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CrossBrowserTesting {
	
	//private static final WebDriver Null = null;
	
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1 to Execute script on Google Chrome \nEnter 2 to Execute script on Mozilla FireFox \nEnter 3 to Execute script on Microsoft Edge \nEnter 4 to execute script on opera browser");
		int choice=s.nextInt();
		
		Select s1;
		WebDriver driver=null; 
		switch(choice)
		{
		case 1:
				System.out.println("Welcome to Google Chrome");
				System.setProperty("webdriver.chrome.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\chromedriver.exe");
				driver=new ChromeDriver();
				break;
				
		case 2:
				System.out.println("Welcome to Mozilla FireFox");
				//System.setProperty("webdriver.gecko.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\geckodriver.exe");
				driver=new FirefoxDriver();
				break;
				
		case 3:
			   System.out.println("Welcome to Microsoft Edge");
			   System.setProperty("webdriver.msedge.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\msedgeDriver.exe");
			   driver=new EdgeDriver();
			   break;
			   
		case 4:
			   System.out.println("Welcome to Opera Browser");
			   System.setProperty("webdriver.opera.driver", "D:\\AMRITHA\\AutomationTesting\\browserExtension\\chromedriver.exe");
			   //driver= new OperaDriver();
			   
			   
			   
			   
				default:
					System.out.println("Invalid Output");
			
		}
		
		driver.manage().window().maximize();
		
		// Enter URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		//Enter Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		//Click On Login Button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		
		// Click On Burger Button
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		// Click on Logout Button
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		
		// Close the Browser
		driver.close();

	}
}
