import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // It will let the text to come
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU2OTEzMTM3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		/*driver.findElement(By.id("email")).sendKeys("sandeep ");
		driver.findElement(By.name("pass")).sendKeys("sandeep");
		driver.findElement(By.name("login")).click();
		//Thread.sleep(4000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("div._9ay5")).getText());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Binwal");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Binwal");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//div/button")).click();*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("9773562422");
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("Khushi@12");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft')]")).click();
		//Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("Khushi@123");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft')]")).click();
		
	}

}
