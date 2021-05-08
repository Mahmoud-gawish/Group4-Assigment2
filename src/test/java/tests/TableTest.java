package tests;

import org.testng.annotations.Test;

import pages.TablePage;

public class TableTest extends TestBase {
	
	
	TablePage tableObject;
	
	@Test
	public void getValue() {
		
		tableObject= new TablePage(driver);
		
		// add the task value 
		tableObject.getByTaskName("jQuery library");
	}

}
