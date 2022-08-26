package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    driver.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	}

}
