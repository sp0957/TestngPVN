package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
  
	public void onTestStart(ITestResult tr) {
		System.out.println("Test Started..");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test is Success...");
	}
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test is Failure..");
	}
	public void onTestSkipeed(ITestResult tr) {
		System.out.println("Test is Skipeed..");
	}
}
