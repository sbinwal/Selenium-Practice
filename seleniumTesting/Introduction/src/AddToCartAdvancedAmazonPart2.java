import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddToCartAdvancedAmazonPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,5);
		String [] veggies = {"Cucumber", "Brocolli"};
		driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	    addItems(driver, veggies);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
      //explicit wait
        w.until(ExpectedConditions.frames(By.cssSelector("input.promoCode")));
       
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector("button.promoBtn")).click();
	   
	    //explicit wait
	    
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	
	public static void addItems(WebDriver driver, String [] veggies)
	{
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
	
   
   }}}

