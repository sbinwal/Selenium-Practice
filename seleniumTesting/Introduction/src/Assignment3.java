import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		String [] phones = {"iphone X","Nokia Edge","Blackberry"};
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
        driver.findElement(By.xpath("//label[@class='customradio'] //input[@value='user']/following-sibling:: span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("okayBtn")).click();
        WebElement staticDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
         Select dropdown = new Select(staticDropdown);
         dropdown.selectByVisibleText("Teacher");
         driver.findElement(By.id("terms")).click();
         driver.findElement(By.id("signInBtn")).click();
        // WebDriverWait w = new WebDriverWait(driver,5);
         int j=0;
         List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title'] //a[@href='#']"));
         for (int i=0;i<products.size();i++)
         {
        	 String name = products.get(i).getText();
        	 List al = Arrays.asList(phones);
        	 if(al.contains(name))
        	 {
        		 driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
                 j++;
        	 }
        	 if(j==al.size())
        	 {
        		 break;
        	 }
         }
         Thread.sleep(5000);
         //w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='nav-link btn btn-primary']")));
	driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
	}

}
