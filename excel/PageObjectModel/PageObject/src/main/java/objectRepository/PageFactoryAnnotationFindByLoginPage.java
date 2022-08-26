package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryAnnotationFindByLoginPage {

	WebDriver driver;
	public PageFactoryAnnotationFindByLoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this)
	}
	/*By username = By.xpath("//input[@id='login1']");
   By password = By.name("passwd");
   By go = By.name("proceed");
   By home= By.xpath("//a[@href=\"https://www.rediff.com\"]");*/
	
	@FindBy(xpath=("//input[@id='login1']"))
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(xpath="//a[@href=\"https://www.rediff.com\"]")
	WebElement home;
   
   public WebElement EmailId() {
		return username;
	}
   public WebElement Password() {
 		return password;
 	}
   public WebElement Submit() {
		return go;
		
    public WebElement Home() {
		return home;
	}
   
   public WebElement Home() {
	   return driver.findElement(home);
   }
}
