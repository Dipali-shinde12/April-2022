package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("on test start method started"+result.getTestName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("once test method success"+result.getTestName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("once test method failure"+result.getTestName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	System.out.println("once test method skipped"+result.getTestName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("once test failed but within success percentage"+result.getTestName());		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("once test failed with timeout"+result.getTestName());		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("On Start method started");	
	}

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("on finish method finished");	
 
}
}