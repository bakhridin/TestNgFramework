package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ReportPage extends CommonMethods {
	
	@FindBy(id="menu_core_viewDefinedPredefinedReports")
	public WebElement reportPage;
	
	@FindBy(id="btnAdd")
	public WebElement addButton;
	
	@FindBy(id="report_report_name")
	public WebElement reportName;
	
	@FindBy(id="report_criteria_list")
	public WebElement selectionCriteria;
	
	@FindBy(xpath="//fieldset[@id='criteria_fieldset']/ol/li[2]/select")
	public WebElement reportCompare;
	
	@FindBy(id="report_display_groups")
	public WebElement displayGroups;
	
	@FindBy(id="btnAddConstraint")
	public WebElement criteriaAddButton;
	
	@FindBy(id="btnAddDisplayGroup")
	public WebElement fieldAddButton;
	
	@FindBy(id="display_group_1")
	public WebElement checkBox;
	
	@FindBy(id="btnSave")
	public WebElement reportSaveBTN;
	
	@FindBy(id="employee_name_empName")
	public WebElement empName;
	
	@FindBy(id="report_display_field_list")
	public WebElement displayFields;
	
	public ReportPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToReport() {
		moveHoverToElement(dashboard.PIM);
		click(report.reportPage);
		sleep(1);
		click(report.addButton);
		
	}

}
