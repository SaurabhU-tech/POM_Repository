package POM_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pOM_WithoutPF.LoginPageORwithoutPF;

public class TestCases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LoginPageORwithoutPF Login = new LoginPageORwithoutPF(driver);
		
		//Create Admin Login Test Case
		Login.launchApplication("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		Login.typeUsername("Admin");
		Thread.sleep(3000);
		Login.typePassword("Admin@123");
		Thread.sleep(3000);
		Login.captureUsername();
		Thread.sleep(3000);
		Login.clickLoginButton();
		Thread.sleep(3000);
		Login.clearUsername();
		Thread.sleep(3000);
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(6000);
		if(url1.contains("http://www.gcrit.com/build3/admin/")) {
			System.out.println("Admin Login is successful - passed");
		} else {
			System.out.println("Admin Login is unsuccessful - failed");
		}
//		driver.close();
	}

}
