package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {

	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By search = By.id("srchword");
	By submit = By.xpath("//form[@name='srchform'] //input[@class='newsrchbtn']");
	 public WebElement Search() {
			return driver.findElement(search);
		}
	 public WebElement Submit() {
			return driver.findElement(submit);
		}
}
