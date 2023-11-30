package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHRM.library.Loginpage;
import utils.Apputils;

public class AdminLoginTestWithInvalidInput extends Apputils
{
	@Parameters({ "uid","pwd"})
	@Test
    public void checkAdminLogin( String uid, String pwd) 
    {
    	Loginpage lp=new Loginpage();
    	lp.login(uid, pwd);
    	 boolean res=lp.IserrormessageDisplayed();
    	 Assert.assertTrue(res);
    }
}
