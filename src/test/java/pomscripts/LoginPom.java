package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = " //button[@type='submit']")
	private WebElement loginbtn;
	
	
	public LoginPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void username(String un)
	{
		username.sendKeys(un);
	}
	
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
}
