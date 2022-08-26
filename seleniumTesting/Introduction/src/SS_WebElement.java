import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement name = driver.findElement(By.cssSelector("[name='name]"));
       name.sendKeys("Sandeep");
       //Taking Ss
       File file = name.getScreenshotAs(OutputType.FILE); //SS will save in file format
       FileUtils.copyFile(file,new File("logo.png"));
       
       //Grtting dimension of the WebElement
       System.out.println(name.getRect().getDimension().getHeight());
       System.out.println(name.getRect().getDimension().getWidth());
	}

}
