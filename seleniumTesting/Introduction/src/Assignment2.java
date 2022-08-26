import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sandeep Binwal");
        
        driver.findElement(By.xpath("//div[@class=\"form-group\"] //input[@name=\"email\"]")).sendKeys("Sandeepbinwal143@gmail.com");
        driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("73648736@San");
        driver.findElement(By.xpath("//div[@class=\"form-check\"] //input[@class=\"form-check-input\"]")).click();
        WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	}

}
