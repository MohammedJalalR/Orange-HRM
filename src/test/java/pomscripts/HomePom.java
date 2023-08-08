package pomscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePom {

	@FindBy(xpath = "//span[.='PIM']")
	private WebElement pim;

	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement min;

	@FindBy(xpath = "//a[.='Add Employee']")
	private WebElement addEmp;

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middleName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastName;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebtn;

	@FindBy(xpath = "//a[.='Employee List']")
	private WebElement AddEmployeeList;
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement EmployeeNameField;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement search;
	@FindBy(xpath = "(//div[.='Twinkle keshri'])[1]")
	private WebElement locatetwinkle;
	@FindBy(xpath = "(//div[.='Arif Raza'])[1]")
	private WebElement locatearif;

	@FindBy(xpath = "(//div[.='Priyajit Samanta'])[1]")
	private WebElement locatepriyajit;
	@FindBy(xpath = "(//div[.='Baraik Sahil'])[1]")
	private WebElement locatebaraik;
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement dropdown;
    @FindBy(xpath = "//a[.='Logout']")
	private WebElement logout;
	public HomePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void pimhovering(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(pim).perform();
	}

	public void pim() {
		pim.click();
	}

	public void addEmp() {
		addEmp.click();
	}

	public void firstName(String fn) {
		firstName.sendKeys(fn);
	}

	public void middleName(String mn) {
		middleName.sendKeys(mn);
	}

	public void lastName(String ln) {
		lastName.sendKeys(ln);
	}

	public void savebtn() {
		savebtn.click();
	}

	public void minclick() {
		min.click();
	}

	public void AddEmployeeList() {
		AddEmployeeList.click();
	}

	public void EmployeeNameField(String name) {
		EmployeeNameField.sendKeys(name);
	}

	public void search() {
		search.click();
	}

	public String locatetwinkle() {
		String text = locatetwinkle.getText();
		
		return text;
	}

	public String locatearif() {
		String text = locatearif.getText();
		return text;
	}

	public String locatepriyajit() {
		String text = locatepriyajit.getText();
		return text;
	}

	public String locatebaraik() {
		String text = locatebaraik.getText();
		return text;
	}
	
	public void dropdown()
	{
		dropdown.click();
	}
	
	public void logout()
	{
		logout.click();
	}
}
