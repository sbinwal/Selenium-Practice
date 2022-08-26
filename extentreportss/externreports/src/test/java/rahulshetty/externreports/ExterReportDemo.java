package rahulshetty.externreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExterReportDemo {
	ExtentReports extent = new ExtentReports();
	@BeforeTest
	public void config() {
		String path=System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); // It expect a path
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test Results");
		
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Rahul Shetty");
	}
	
	@Test
	public void initialDemo() {
		extent.createTest("Initial Demo"); // It will keep on monitoring the test whether pass or fail
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\csc\\Downloads\\chromedriver_win32\\chromedriver.exe");// for chrome browser
		WebDriver driver = new ChromeDriver();// this will have methods of only web driver
	driver.get("rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	extent.flush();
	
	}

}
