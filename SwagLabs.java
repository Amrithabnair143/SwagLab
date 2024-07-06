package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwagLabs                                      //Storing WebElements at Entry & Exit point
{
	public void MaximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void URL(WebDriver driver)
	{
		driver.get("https://www.saucedemo.com/");
	}
	
	public void Username(WebDriver driver, String usn)
	{
		driver.findElement(By.id("user-name")).sendKeys(usn);
	}
	
	public void Password(WebDriver driver, String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	public void LoginButton(WebDriver driver)
	{
		driver.findElement(By.id("login-button")).click();
	}
	
	public void BurgerButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	}
	
	public void LogoutButton(WebDriver driver)
	{
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	
	public void AboutUs(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]")).click();
	}
	
	
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
	



}

