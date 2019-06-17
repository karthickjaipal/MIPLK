package Dashboard;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserManagement {
	
	@BeforeTest
	public void checkDashboard()
	{
		System.out.println("Dashoard exists");
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
	public void createUser(){
		System.out.println("User created successfully");
	}
	
	@Test
	public void editUser(){
		System.out.println("User edited successfully");
	}
	
	@Test
	public void deleteUser(){
		System.out.println("User deleted successfully");
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
	
	//module level/class
	@AfterTest
	public void isDashboard()
	{
		System.out.println("Dashboard closure");
	}

}
