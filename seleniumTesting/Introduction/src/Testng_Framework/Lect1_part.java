package Testng_Framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lect1_part {
	@BeforeTest
	public void Loann() {
		System.out.println("BeforeClass");
	}
	
	
	@Test(groups=("Smoke"))
	public void Loan() {
		System.out.println("good");
	}
	
	@AfterTest
	public void Last() {
		System.out.println("I will execute at last");
	}
}
