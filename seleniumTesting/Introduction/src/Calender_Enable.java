import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Enable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      /* System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); */
        driver.findElement(By.id("Div1")).getAttribute("style");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("Div1")).getAttribute("style");
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
	}

}
