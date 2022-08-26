package Testng_Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lect3 {

	@Test(groups=("Smoke"))
	public void WebloginCarLoan()
	{
		System.out.println("cc");
	}
	
	@Test(groups=("Smoke"))
	public void MobileloginCarLoan()
	{
		System.out.println("ss");
	}
	
	@Test
	public void MobilesloginCarLoan()
	{
		System.out.println("ff");
	}
	@Test
	public void MobileoginCarLoan()
	{
		System.out.println("hh");
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		//Rest API automation
		System.out.println("ll");
	}
	@BeforeTest
	public void LoginFirst()
	{
		System.out.println("I will execute at first");
	}
	@BeforeSuite
	public void LoginFirstt()
	{
		System.out.println("I will execute at first from top");
	}
	@BeforeMethod
	public void LoginFirsttt()
	{
		System.out.println("I will execute everytime");
	}
}
