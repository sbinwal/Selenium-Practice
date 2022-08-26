import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        File src = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE); // output that ss in a file and we are storing ss in file.
       
        //bringing the screenshot from src to our system
        FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
	}

}
