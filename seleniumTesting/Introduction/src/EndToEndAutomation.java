import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Dynamic Dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        //calender
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //Calender is Dissable Confirm
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
        driver.findElement(By.id("divpaxinfo")).click();
        int i= 1;
        Thread.sleep(2000);
        while(i<5)
        {
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
