package SeleniumBase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class ProjectSpecificMethods {

public static ChromeDriver driver;
@BeforeMethod
	public void login (){
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	

}




