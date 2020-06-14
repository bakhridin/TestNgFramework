package com.hrms.testcases;


import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class Definereport extends CommonMethods {
	
	@Test(groups= {"smoke"})
	public void report() {
		//test.info("Entering valid credentials to HRMS Application");
		
	test.info("Entering hrms credentials");
		//entering hrms credentials
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		
	test.info("Navigating to report page");
		//navigate to report page
		report.navigateToReport();
	test.info("Sending report name");
		sendText(report.reportName, "Report ");
	test.info("Cnoosing Employee name from selection creteria");
		selectDdValue(report.selectionCriteria, "Employee Name");
	
	test.info("Clicking criteria Add button ");
		click(report.criteriaAddButton);
	
	test.info("Sending employee name and last name and clicking Enter button in computer keyword");
		report.empName.sendKeys("Bahram Akash",Keys.ENTER);
		
	test.info("Choosing Current Employee Only from drop downs");	
		selectDdValue(report.reportCompare, "Current Employees Only");
		selectDdValue(report.displayGroups, "Personal ");
		click(report.fieldAddButton);
		selectDdValue(report.displayFields, "Employee Id");
		
		click(report.checkBox);
		
		
		
		click(report.reportSaveBTN);
		
		
		
	}

}
