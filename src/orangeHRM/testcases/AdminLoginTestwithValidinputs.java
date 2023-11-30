package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHRM.library.Loginpage;
import utils.Apputils;

public class AdminLoginTestwithValidinputs extends Apputils
{
	@Parameters({ "adminuid","adminpwd"})
	@Test
    public void checkAdminLogin( String uid, String pwd)
    {
		Loginpage lp= new Loginpage();
		lp.login(uid, pwd);
		 boolean res=lp.isAdminmoduleDisplayed();
		 Assert.assertTrue(res); 
		 lp.logout();
    }
}
