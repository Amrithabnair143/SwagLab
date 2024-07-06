package mainProgram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class MainFunctionality {

	public static void main(String[] args) throws Exception
	{
		// Browser Settings
				System.setProperty("webdriver.chrome.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\chromedriver.exe");
				WebDriver driver =new ChromeDriver();
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// Maximize Window
				driver.manage().window().maximize();
				  
				// Navigating to the URL
				driver.get("https://www.saucedemo.com/");
				Thread.sleep(2000);
				
				//Logging In
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(4000);
				
				// Selecting Items and Adding to Cart
				driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("back-to-products")).click();
				Thread.sleep(4000);
				
				//ScrollDown Using Pixel
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);
				
				//Select Another Item
				driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
				Thread.sleep(4000);
				driver.findElement(By.id("back-to-products")).click();
				Thread.sleep(4000);
				
				
				//driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).click();
				Thread.sleep(4000);
				//driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
				Thread.sleep(4000);
				//driver.findElement(By.id("back-to-products")).click();
				Thread.sleep(4000);
				
				//Add 3rd Item to Cart
				JavascriptExecutor jss= (JavascriptExecutor)driver;
				 
				jss.executeScript("window.scrollBy(0,200)");
				Thread.sleep(3000);
				driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
				Thread.sleep(4000);
				
				jss.executeScript("window.scrollBy(0,-200)");
				Thread.sleep(3000);
				
				//Go to Cart
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				Thread.sleep(4000);
				
				//Remove 1 Item
				driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
				Thread.sleep(4000);
				
				//Click On Continue Shopping
				driver.findElement(By.id("continue-shopping")).click();
				Thread.sleep(4000);
				
				//Add Two More Items to Cart
				driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
				Thread.sleep(4000);
				jss.executeScript("window.scrollBy(0,600)");
				Thread.sleep(3000);
				driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
				Thread.sleep(3000);
				
				//Go to Cart
				jss.executeScript("window.scrollBy(0,-600)");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
				Thread.sleep(4000);
				
				//Checkout
				jss.executeScript("window.scrollBy(0,500)");
				Thread.sleep(4000);
				driver.findElement(By.id("checkout")).click();
				Thread.sleep(4000);
				
				//EntercheckoutDetails
				jss.executeScript("window.scrollBy(0,-100)");
				Thread.sleep(4000);
				driver.findElement(By.id("first-name")).sendKeys("Amritha");     				
				Thread.sleep(3000);
				driver.findElement(By.id("last-name")).sendKeys("B Nair");        			
				Thread.sleep(3000);
				driver.findElement(By.id("postal-code")).sendKeys("680741");       			
				Thread.sleep(3000);
				
				//ScreenShot of Information
				File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f1, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\CheckOutInformation.jpg"));
				
				
				driver.findElement(By.id("continue")).click();         
				Thread.sleep(3000);
				
				//Screenshots of Checkout Page
				File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f2, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\CheckoutPageUP.jpg"));
				
				//ScrollDown Page
				jss.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);
				
				File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f3, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\CheckoutPageDown.jpg"));
				//Thread.sleep(2000);
				
				//ClickOnContinue And SS of PlacedOrder
				driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
				Thread.sleep(3000);
				File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f4, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\PlacedOrder.jpg"));
				
				//Back To Home Page
				driver.findElement(By.id("back-to-products")).click();
				Thread.sleep(3000);
				
				//Check Filter with DropDown with every option
				
				//Click on Filter
				driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
				Thread.sleep(2000);
			
				//Name Z to A
				driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
				File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f5, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\Name(ZtoA).jpg"));
				Thread.sleep(4000);
				
				//Price Low to High
				driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
				File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f6, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\Name(ZtoA).jpg"));
				Thread.sleep(4000);
				
				//Price High to Low
				driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
				File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(f7, new File("D:\\AMRITHA\\AutomationTesting\\ScreenShots\\Name(ZtoA).jpg"));
				Thread.sleep(4000);
				
				
				//Logout
				driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Logout")).click();
				
				//CloseTheBrowser
				driver.close();


	}

}
