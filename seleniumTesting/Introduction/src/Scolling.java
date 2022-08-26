import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scrolling whole page
		js.executeScript("windows.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//Scrolling a perticular area
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement>values = driver.findElements(By.xpath("//td[4]"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		String a = driver.findElement(By.cssSelector("[class='totalAmount']")).getText();
		//int c = (driver.findElement(By.cssSelector("[class='totalAmount']")).getText()).split(":")[1].trim();
		String[] sp = a.split(":");
	    int c = Integer.parseInt(sp[1].trim());
	    Assert.assertEquals(sum, c);
	    
	}

}
