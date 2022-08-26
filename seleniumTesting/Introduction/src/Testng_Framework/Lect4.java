package Testng_Framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lect4 {

	@Test
	public void WebloginHomeLoan()
	{
		//selenium
	}
	
	@Test(dataProvider=("getData"))
	public void MobileloginHomeLoan(String UserName, String Password)
	{
		System.out.println(UserName);
		System.out.println(Password);
		System.out.println("once more");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="sirstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
				
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
				
		return data;
	}
}
