import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaStream2imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<String> price;
        do{
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
       price =  elementList.stream().filter(s->s.getText().contains("Orange")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
        price.forEach(s->System.out.println(s));
        if(price.size()<1)
        {
        	driver.findElement(By.cssSelector("[aria-label='Next']")).click();
        }
	}
        while(price.size()<1);
        
	}
	
	private static String getPriceVeggie(WebElement s)
	{
		WebDriver driver = new ChromeDriver();
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return priceValue;
	}

}
