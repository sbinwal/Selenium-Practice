import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		// Chrome - Chrome Driver -> methods close get
		//Firefox- FirefoxDriver -> methods close get
		//safari= SafariDriver -> methods close get
		//WebDriver close get
		
		//Chrome Driver
		//ChromeDriver driver = new ChromeDriver(); // this will have methods of both web driver and chrome driver
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		
		//Firefox Driver
		//System.setProperty("webdriver.decko.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new FirefoxDriver()
		
		//Edge Driver
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://chromedriver.chromium.org/downloads");
        System.out.println(driver.getTitle());
        System.out.println( driver.getCurrentUrl());
        driver.close();
	}

}
