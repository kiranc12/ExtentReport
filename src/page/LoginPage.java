package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration 
	WebDriver driver;
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUserName(String name) {
		unTB.sendKeys(name);
	}
	public void setPassword(String pass) {
		pwTB.sendKeys(pass);
	}
	public void clickLogin() {
		loginBTN.click();;
	}
	
	

}
