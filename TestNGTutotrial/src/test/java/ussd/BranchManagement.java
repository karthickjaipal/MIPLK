package ussd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BranchManagement {
	
	
	
	@BeforeClass
	public void checkforBranchManag()
	{
		System.out.println("BranchManagement exists");
	}
	
	
	
	
	@Test
	public void ussdCreateBranch(){
		System.out.println("USSDBranch created successfully");
	}
	
	@Test
	public void ussdEditBranch(){
		System.out.println("USSDBranch edited successfully");
	}
	
	@Test
	public void ussdDeleteBranch(){
		System.out.println("USSDBranch deleted successfully");
	}
	
	
	
	@AfterClass
	public void testExecution()
	{
		System.out.println(" ussd Execution completed");
	}
	
	

}
