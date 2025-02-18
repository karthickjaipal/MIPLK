package Dashboard;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BranchManagement {
	
	@BeforeSuite
	public void clearBrowserHistoryandOpenDBConnection()
	{
		System.out.println("Cleared browser hsitory and jdbc connection opened");
	}
	
	@BeforeClass
	public void checkforBranchManag()
	{
		System.out.println("BranchManagement exists");
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		System.out.println("Connect to the Dashboard URL");
	}
	
	@Test
	public void createBranch(){
		System.out.println("Branch created successfully");
	}
	
	@Test
	public void editBranch(){
		System.out.println("Branch edited successfully");
	}
	
	@Test
	public void deleteBranch(){
		System.out.println("Branch deleted successfully");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("logout Dashboard");
	}

	@AfterClass
	public void testExecution()
	{
		System.out.println(" Dashboard Execution completed");
	}
	
	@AfterSuite
	public void clearBrowserHistoryandcloseDBConnection()
	{
		System.out.println("Cleared browser hsitory and jdbc connection closed");
	}
}
