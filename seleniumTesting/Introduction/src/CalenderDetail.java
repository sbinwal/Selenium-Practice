import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.id("travel_date")).click();
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class=datepicker-switch']")).getText().contains("April"))
        {
        	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
        int count = driver.findElements(By.cssSelector(".day")).size();
        for(int i= 0; i<count ; i++)
        {
        	String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
        if(text.equalsIgnoreCase("23"))
        {
        	 driver.findElements(By.cssSelector(".day")).get(i).click();
        	 break;
        }
        }
	}

}
