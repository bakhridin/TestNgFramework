package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constans;
import com.hrms.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {

	@Test(dataProvider = "getData2FromExcel", groups = { "regression", "addEmp", "HomeWork" })
	public void addEmployee(String firstName, String lastName, String username, String password) {

		test.info("Entering Hrms application with valid credenttials");
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

		// navigate to Add Employee page
		test.info("Navigating to employee page");
		dashboard.navigateToAddEmployee();

		// add employee information
		test.info("sending employee credentials");
		sendText(employeePage.firstName, firstName);
		sendText(employeePage.lastName, lastName);
		// get EmployeeID
		String expectedEmpId = employeePage.employeeId.getAttribute("value");

		// click on Create Login Details
		test.info("clicking on 'credential button' ");
		click(employeePage.credentialButton);

		test.info("sending additional emplyee data");
		sendText(employeePage.credenUserName, username);
		sendText(employeePage.credenUserPasswor, password);
		sendText(employeePage.confirmCredenPassword, password);
		test.info("saving employee with clicking save button");
		
		jsClick(employeePage.saveButton);

		// validation

		test.info("comparing addemployee id text with personal employee page id  ");
		waitForVisibility(pdetails.lblPersonalDetails);
		String actualEmpId = pdetails.employeeId.getAttribute("value");
		Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");
	}

	@DataProvider(name = "userData")
	public Object[][] getData() {
		Object[][] data = { { "Raj", "Capoor", "raj123", "AmirKhan_@123" },
				{ "John", "Smith", "john123", "AmirKhan_@123" }, { "Mary", "Ann", "mary123", "AmirKhan_@123" },
				{ "Rohani", "Sakhi", "rohani123", "AmirKhan_@123" }, { "Ali", "Tarlaci", "ali123", "AmirKhan_@123" }, };
		return data;

	}

	@DataProvider(name = "getData2FromExcel")
	public Object[][] getData2() {
		Object[][] getData2 = ExcelUtility.getDataFromExcel(Constans.TESTDATA_FILEPATH, "EmployeeCreden");

		return getData2;
	}

}
