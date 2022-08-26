import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
       List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
       for(int i=0;i<products.size();i++)
       {
    	   String name = products.get(i).getText();
    	   
    	   
     
        if(name.contains("Cucumber"))
        {
        	driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();
        }
       }
	}

}
