package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProDemo {
	
	
	@Test(dataProvider="getData")
	public void  addERmp(String fName,String mName,String lName) {
		System.out.println(fName +" "+mName+" "+lName);
		
	}
	
	@DataProvider//(name="test")
	public Object[][] getData() {
		
		Object[][] data= {
				{"Sarmed","H","Halabi"},
				{"Fadwa","A","Fadwa"},
				{"Adile","K","Karadeniz"}
				
				          };
		return data;
	}

}
