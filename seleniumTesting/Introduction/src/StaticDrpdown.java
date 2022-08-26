import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDrpdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       // WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       // Select dropdown = new Select(staticDropdown);
        //dropdown.selectByIndex(3);
       // dropdown.selectByVisibleText("AED");
        //System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("option[value=\"AED\"]")).click();

	}

}
