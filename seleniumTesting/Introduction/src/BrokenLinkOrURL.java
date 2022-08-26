import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkOrURL {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert a = new SoftAssert();
        
        //Get all URLs tied up to the links using Selenium
        //Java Methods will call URL's and gets you the status code
        //if status code>400 then that url is not working
        
        List<WebElement> links =  driver.findElements(By.cssSelector("//li[@class='gf-li']/a"));
        for(WebElement link : links) 
        {
        	String url = link.getAttribute("href");
        HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection(); // here URL is a class and openConnection is a method
        conn.setRequestMethod("HEAD");
        conn.connect();
        int rescode = conn.getResponseCode();
        System.out.println(rescode);
        a.assertTrue(rescode<400,"The link with Text\" + link.getText()+\"is broken with code\" +rescode");
        //This will break once it found the error but our goal is to continue after failure also
       /* if(rescode>400) {
        	System.out.println("The link with Text" + link.getText()+"is broken with code" +rescode);
        Assert.assertTrue(false);
        }*/
        }
        a.assertAll();
	} 

}
