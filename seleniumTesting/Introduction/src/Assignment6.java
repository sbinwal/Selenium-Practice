import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String value = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		 WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
	       Select dropdown = new Select(staticDropdown);
	        dropdown.selectByVisibleText(value);
	        driver.findElement(By.id("name")).sendKeys(value);
	        driver.findElement(By.id("alertbtn")).click();
	        String a = driver.switchTo().alert().getText();
	        String [] b =a.split("Hello");
	        String [] c= b[1].split(",");
	        String d= c[0].trim();
	        System.out.println(d);
	        		
	}

}
