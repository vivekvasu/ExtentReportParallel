package tests;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.xml.XmlTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.ExtentManager;

public class BaseTests 
{
	private static ExtentReports extent;
	public static ThreadLocal<ExtentTest> methods = new ThreadLocal<ExtentTest>();
	public static ThreadLocal <ExtentTest> parentTest = new ThreadLocal<ExtentTest>();

	@BeforeSuite
	public synchronized void initialSetUp(ITestContext context)
	{
		extent = ExtentManager.getInstance();
	}

	@BeforeTest
	public synchronized void beforeTest(XmlTest method) 
	{
		ExtentTest tests = extent.createTest(method.getName());
		parentTest.set(tests);
	}

	@BeforeMethod
	public synchronized void beforeMethod(Method method) 
	{
		ExtentTest testmethod = parentTest.get().createNode(method.getName());
		methods.set(testmethod);
	}

	@AfterMethod
	public void afterMethod (ITestResult result)
	{
		if (result.getStatus() == ITestResult.SUCCESS)
		{
			methods.get().pass("Test Passed");
		}
		else if (result.getStatus() == ITestResult.FAILURE)
		{
			methods.get().fail(result.getThrowable());
		}
		else if (result.getStatus() == ITestResult.SKIP)
		{
			methods.get().skip(result.getThrowable());
		}
	}

	@AfterSuite
	public void quitBrowser ()
	{
		extent.flush();
	}
}
