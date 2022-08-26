package Testng_Framework;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Lexture1 {
     
	@Test
	public void Test(){
	
	System.out.println("Hello World");
}
	@Parameters({"URL"})
	@BeforeTest
	public void Test2(String urlname){
	
	System.out.println("Bye World");
	System.out.println(urlname); 
}
	} 
