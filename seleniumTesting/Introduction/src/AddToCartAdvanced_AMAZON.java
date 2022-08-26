import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartAdvanced_AMAZON {

	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		String [] veggies = {"Cucumber", "Brocolli"};
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
       List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
       int j=0;
       for(int i=0;i<products.size();i++)
       {
    	   String[] name = products.get(i).getText().split("-");
    	   String formatedName= name[0].trim();
    	   
    	   
    	   // Check whether name you extracted is present in the array list or not
    	   
    	   // Convert array into arraylist for easy search
    	List al = Arrays.asList(veggies);
      
    	if(al.contains(formatedName))
      {
    		//It will give wrong result
    	  //driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();  
        // It will give correct result
    		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();  
    		
    		j++;
          
          if(j==al.size())
      	{
      		break;
      	}
      }
    	
       
       }
	}
}
