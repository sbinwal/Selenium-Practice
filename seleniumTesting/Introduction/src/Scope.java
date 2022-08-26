import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
		//Printing total numner of links
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Printing total number of link in a perticular area
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Printing total number of link in a perticular section of a area
		WebElement columndriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
	   
		//Clicking on all the links
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
	    {
	    	String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); // it will open all links in new window
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	    	Thread.sleep(5000);
	    	
	    	
	    	
	    }
		//Grabing title of all the links
	    Set<String> windows = driver.getWindowHandles(); // It will give id of all the window and it is a set
    	Iterator <String> it = windows.iterator();
    	while(it.hasNext())
    	{
    		driver.switchTo().window(it.next());
    		System.out.println(driver.getTitle());
    	}
	}

}
