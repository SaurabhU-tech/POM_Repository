package pOM_WithoutPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageORwithoutPF {
	WebDriver driver;
	
	//Create elements using element locators
	By User = By.id("login1");
	By Password = By.id("password");
	By LoginButton = By.name("proceed");
	
	//Constructor must have same name as class name and only one constructor can be there in every class
		//this keyword is used to invoke or instantiate current class constructor
		// A constructor in java is a block of code similar to a method
		//that's called an instance of object is created
	public LoginPageORwithoutPF(WebDriver driver) {
		this.driver = driver;
	}
	
	//Create user actions
	public void typeUsername(String Uname) {
		driver.findElement(User).sendKeys(Uname);
	}
	public void typePassword(String Pwd) {
		driver.findElement(Password).sendKeys(Pwd);
	}
	public void captureUsername() {
		String val;
		val = driver.findElement(User).getAttribute("value");
		System.out.println(val);
	}
	public void clearUsername() {
		driver.findElement(User).clear();
	}
	public void clickLoginButton() {
		driver.findElement(LoginButton).click();
	}
	public void launchApplication(String Url) {
		driver.get(Url);
	}
}
