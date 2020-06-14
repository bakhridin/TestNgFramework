package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AnnotationDemo {

	
	@BeforeClass
public void executeBeforeM() {	
	System.out.println("I open browser and lunch url");
}
	
	
@Test(priority=1)
public void methodOne() {
	//System.out.println("My first testcase=login");
	String expectedTitle="HRMS";
	String actualTitle="HRMS";
	
	Assert.assertEquals(expectedTitle, actualTitle, "true");
	
}
//
//@Test(priority=2)
//public void methodTwo() {
//	System.out.println("My second testcase=dashbord");
//	
//}
//
//@Test(priority=3)
//public void methodThree() {
//	System.out.println("My third testcase=add employee");
//	
//	
//	
//}

}
