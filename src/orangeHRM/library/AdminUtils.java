package orangeHRM.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Apputils;

public class AdminUtils extends Apputils
{
	Loginpage lp;
	String adminuid="Admin";
	String adminpwd="Qedge123!@#";
	
	@BeforeTest
  public void adminlogin() 
  { 
	  lp=new Loginpage();
	  lp.login(adminuid, adminpwd);
  }
	@AfterTest
  public void adminLogout() 
   { 
	  lp.logout();
   }
}
