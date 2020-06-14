package com.hrms.testbase;



import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ReportPage;
import com.hrms.pages.addEmplopyeePage;
import com.hrms.pages.sauceDemoLoginpage;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static addEmplopyeePage employeePage;
	public static sauceDemoLoginpage sauceDemoPage;
	public static ReportPage report;
	
	
	public static void initialize() {
		 login=new LoginPageElements();
		 dashboard=new DashBoardPageElements();
		 pdetails=new PersonalDetailsPageElements();
		 employeePage = new addEmplopyeePage();
		 sauceDemoPage=new sauceDemoLoginpage();
		 report=new ReportPage();
	}

}
