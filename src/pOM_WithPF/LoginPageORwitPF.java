package pOM_WithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageORwitPF {
	WebDriver driver;
	
	public LoginPageORwitPF(WebDriver driver)
	{
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login1")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID, using="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how = How.NAME, using = "proceed")
	@CacheLookup
	WebElement submit_button;
	
	public void enterUsername() {
		username.sendKeys("India");
	}
	public void enterPassword() {
		password.sendKeys("India123");
	}
	public void clickButton() {
		submit_button.click();
	}
	public void launchApp(String url) {
		driver.get(url);
	}
}
