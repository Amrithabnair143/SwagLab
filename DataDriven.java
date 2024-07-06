package testNG_Functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModule.SwagLabs;

public class DataDriven 
{
	WebDriver driver;
	@BeforeTest
	  public void setUp() 
	  {
		System.setProperty("webdriver.chrome.driver","D:\\AMRITHA\\AutomationTesting\\browserExtension\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	  }
	
    @Test(dataProvider = "dp")
    public void dataDriven(String username, String password) throws Exception
    {
    	//Object of OrangeHRM class
    	SwagLabs o= new SwagLabs();
    	o.URL(driver);
    	Thread.sleep(2000);
    	o.Username(driver, username);
    	Thread.sleep(2000);
    	o.Password(driver, password);
    	Thread.sleep(2000);
    	o.LoginButton(driver);
    	Thread.sleep(2000);
    	o.BurgerButton(driver);
    	Thread.sleep(2000);
    	o.LogoutButton(driver);
    	
    	
    	
    }

    @DataProvider
    public Object[][] dp() 
    {
      return new Object[][]                 // This is 2D array which stores username and password >> Test Data
    {
        new Object[] {"standard_user" , "secret_sauce" },
        new Object[] { "amritha", "abn@2212" },
        new Object[] {"locked_out_user" , "secret_sauce" },
        new Object[] { "testswag@", "testswag" },
        new Object[] {"problem_user" , "secret_sauce" },
        new Object[] { "performance_glitch_user", "secret_sauce" },
    };
  }
  

    @AfterTest
    public void tearDown()
    {
    	driver.close();
    }

}
