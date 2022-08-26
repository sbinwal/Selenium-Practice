import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href=\"/windows\"]")).click();
        // Why explicit wait is not used here 
        driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();
        Set<String> windows = driver.getWindowHandles(); // It will give id of all the window
        Iterator <String> it = windows.iterator();
        String parentId= it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        driver.switchTo().window(parentId);
         System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	}

}
