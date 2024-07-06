package testNG_Functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModule.SwagLabs;

public class ParallelTesting 
{
	  
	  WebDriver driver;
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\chromedriver.exe");
		  driver=new ChromeDriver();
			
		  driver.manage().window().maximize();
	  }
	  
	  @Test(description="Parallel Testing")
	  public void ParallelTesting_SwagLabs () throws InterruptedException
	  {
		  SwagLabs o =new SwagLabs();
		  o.URL(driver);
		  Thread.sleep(2000);
		  o.Username(driver, "standard_user");
		  Thread.sleep(2000);
		  o.Password(driver, "secret_sauce");
		  Thread.sleep(2000);
		  o.LoginButton(driver);
		  Thread.sleep(2000);
		  o.BurgerButton(driver);
		  Thread.sleep(2000);
		  o.LogoutButton(driver);
	  }	  

    @AfterTest
     public void afterTest()
    {
	    driver.close();
    }

}


