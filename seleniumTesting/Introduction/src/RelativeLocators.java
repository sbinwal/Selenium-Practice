import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        //above
       /* WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText(); */
	   
        //Below
        /*WebElement nameEditBox = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(nameEditBox)).click(); */
	
        //Left
        WebElement nameEditBox = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
	driver.findElement(with(By.tagName("input")).toLeftOf((nameEditBox))).click(); 
	
	//Right
        WebElement nameEditBox = driver.findElement(By.cssSelector("[id='inlineRadio1']"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(nameEditBox)).getText());
	}

}
