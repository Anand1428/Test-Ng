package simple_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_annotations {
	

	@BeforeSuite()
	private void setproperty() {
		System.out.println("set property");
	}
	
	@BeforeTest
	private void browserlaunch() {
		// TODO Auto-generated method stub
System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void url() {
		System.out.println("URL");
		
	}
	
	@BeforeMethod
	private void login() {
		// TODO Auto-generated method stub
System.out.println("login");
	}
	@Test 
	private void earphone() {
		// TODO Auto-generated method stub
System.out.println("earphone");
	}
	@Test
	private void shoes() {
		// TODO Auto-generated method stub
System.out.println("shoess");
	}
	@Test
	private void bat() {
		// TODO Auto-generated method stub
System.out.println("Bats");
	}
	
	
	@AfterClass
	private void verifyhome() {
		// TODO Auto-generated method stub
System.out.println("Verify home Page");
	}
	
	@AfterTest
	private void close() {
		// TODO Auto-generated method stub
System.out.println("close");
	}
	
   @AfterSuite
   private void delet() {
	// TODO Auto-generated method stub
System.out.println("Delete all cookies");
}
}
