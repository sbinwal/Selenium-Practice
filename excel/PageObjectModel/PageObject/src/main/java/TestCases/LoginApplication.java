package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomepage;
import objectRepository.RediffLoginPage;

public class LoginApplication {

	@Test
	public void Login()
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		
		rd.EmailId().sendKeys("Hello");
		rd.Password().sendKeys("Hello");
		rd.Submit().click();
		rd.Home().click();
		
		RediffHomepage rh = new RediffHomepage(driver);
		rh.Search().sendKeys("reddif");
		rh.Submit().click();
	}
}
