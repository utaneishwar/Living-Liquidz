package extentlistener;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utility.ReadProp;
import utility.Test;

public class ExtentReporterGen
{    // Class-1:
	  // here we discussed on ExtentHtmlreport required to generate the report 
	static 	ExtentReports extents;
	public static ExtentReports extendReportGenerator()  
	{
		
		// Location of extent report
		String file= System.getProperty("user.dir")+"//reports//LivingLiquidz"+Test.gettime()+".html";
		
		// look and feel of text and theme
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(file);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("7thJanBatchHtmlReport");
		
// Specific content to be print  as a part of information to report
	    extents =new ExtentReports();
		extents.attachReporter(reporter);
		extents.setSystemInfo("Executed by", "7thJanBatch");
		extents.setSystemInfo("Environment", "SIT");		
		extents.setSystemInfo("Browser", "chrome");	
		
		return extents;
		

		
		
		
	}

}
