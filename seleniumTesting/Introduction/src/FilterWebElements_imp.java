import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebElements_imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
        driver.findElement(By.xpath("search-field")).sendKeys("Rice");
        List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList = elementList.stream().filter(veggies->veggies.getText().contains("Rice")).collect(Collectors.toList());
        Assert.assertEquals(elementList.size(), filteredList.size());
	}

}
