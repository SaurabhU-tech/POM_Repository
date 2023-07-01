package POM_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pOM_WithPF.LoginPageORwitPF;

public class TestCaseWithPF {

	public static void main(String[] args) throws InterruptedException {
		//Mostly in Industry with Page Factory method is used
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Create Page Object using Page Factory
		LoginPageORwitPF login1 = new LoginPageORwitPF(driver);
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Create Page Object using Page Factory
//		LoginPageORwitPF login1 = PageFactory.initElements(driver, LoginPageORwitPF.class);

		
		login1.launchApp("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		login1.enterUsername();
		Thread.sleep(3000);
		login1.enterPassword();
		Thread.sleep(3000);
		login1.clickButton();
	}

}
