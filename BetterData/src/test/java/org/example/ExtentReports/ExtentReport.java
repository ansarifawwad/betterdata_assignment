package org.example.ExtentReports;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.IResultMap;


import com.aventstack.extentreports.Status;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class ExtentReport implements IReporter {

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {
        long timeStamp = System.currentTimeMillis();
        for (ISuite suite : suites) {
            String reportFileName = "Extent_" + timeStamp + ".html";
            ExtentReports extent = new ExtentReports();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(outputDirectory + File.separator + reportFileName);
            extent.attachReporter(htmlReporter);

            Map<String, ISuiteResult> result = suite.getResults();

            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();

                buildTestNodes(context.getPassedTests(), Status.PASS, extent);
                buildTestNodes(context.getFailedTests(), Status.FAIL, extent);
                buildTestNodes(context.getSkippedTests(), Status.SKIP, extent);
            }

            extent.flush();
        }
    }

    private void buildTestNodes(IResultMap tests, Status status, ExtentReports extent) {
        ExtentTest test;

        if (tests.size() > 0) {
            for (ITestResult result : tests.getAllResults()) {
                test = extent.createTest(result.getMethod().getMethodName());

                test.getModel().setStartTime(getTime(result.getStartMillis()));
                test.getModel().setEndTime(getTime(result.getEndMillis()));

                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);

                if (result.getThrowable() != null) {
                    test.log(status, result.getThrowable());
                } else {
                    test.log(status, "Test " + status.toString().toLowerCase()
                            + "ed");
                }
            }
        }
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
}
