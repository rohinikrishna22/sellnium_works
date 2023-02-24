package testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations{
	
	@BeforeSuite
	void beforesuite() {
		System.out.println("@BeforeSuite");
		
	}
	@AfterSuite
	void aftersuite() {
		System.out.println("@AfterSuite");
		
	}
	@BeforeTest
 void beforetest() {
	 System.out.println("@BeforeTest");
 }
	
	@AfterTest
	void aftertest() {
		System.out.println("@AfterTest");
		
	}
	
@BeforeGroups()
	void beforegroups() {
	System.out.println("@BeforeGroups");
}
 
@AfterGroups
void aftergroups() {
	 System.out.println("@AfterGroups ");
	 
}
@BeforeClass	
void beforeclass() {
	System.out.println("@BeforeClass");
	
}
@AfterClass	
void afterclass() {
		System.out.println(" @AfterClass");
	}
@BeforeMethod
void beforemethod() {
	System.out.println("@BeforeMethod ");
}
@AfterMethod

void aftermethod() {
	System.out.println(" @AfterMethod ");
	
}	
@Test()
		void test(){
	System.out.println("@Test");
}
	
}
