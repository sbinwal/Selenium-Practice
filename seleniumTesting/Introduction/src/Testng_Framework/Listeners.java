package Testng_Framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override 
	public void onTestStart(ITestResult result) {
		//
	}
	@Override 
	public void onTestSuccess(ITestResult result) {
		//
	}
	
	@Override 
	public void onTestFailure(ITestResult result) {
		//It will execute after every test failure
	}
}
