package genericscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch implements FrameworkConstant {

	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		System.setProperty(keys, values);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
