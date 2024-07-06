package basicPrograms;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) throws InterruptedException 
	{
		// Browser Settings
		System.setProperty("webdriver.chrome.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// Maximize Window
		driver.manage().window().maximize();
		  
		// Enter URL
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		// Enter your Username with pop-option
		String usn= JOptionPane.showInputDialog("Enter Your Username");
		driver.findElement(By.id("user-name")).sendKeys(usn);
		Thread.sleep(2000);
		
		// Password with pop-option
		String pwd= JOptionPane.showInputDialog("Enter Your Password");
		driver.findElement(By.id("password")).sendKeys(pwd);                   
		Thread.sleep(3000);
			
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
