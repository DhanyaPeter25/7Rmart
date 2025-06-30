package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility 
{

	public static final ExtentReports extentReports = new ExtentReports();
	public synchronized static ExtentReports createExtentReports() 
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("7R Mart"); //to provide name for the report
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Dhanya");
		return extentReports;
	}


/*
            To generate customized report
                    step1.   Add Avenstack dependency in POM
                    step2.   Create Method extend report
 
 */
}
