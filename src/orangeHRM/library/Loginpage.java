package orangeHRM.library;

import org.openqa.selenium.By;

import utils.Apputils;

public class Loginpage extends Apputils
{
public void login(String uid,String pwd)
    {
	    
         driver.findElement(By.id("txtUsername")).sendKeys(uid);
         driver.findElement(By.id("txtPassword")).sendKeys(pwd);
         driver.findElement(By.id("btnLogin")).click();
    }
public boolean isAdminmoduleDisplayed()
   {
	    if (driver.findElement(By.linkText("Admin")).isDisplayed())
	    {
	    	return true;
	    }else 
	    {
	    	return false;
	    }


    }
public void logout()
   {
	 driver.findElement(By.partialLinkText("Welcome")).click();
	 driver.findElement(By.linkText("Logout")).click();
   }
public boolean IserrormessageDisplayed()
    {
	      String errmsg=driver.findElement(By.id("spanMessage")).getText();
	      if ( errmsg.toLowerCase().contains("invalid")|| errmsg.toLowerCase().contains("empty"))
	      {
	    	   return true;
	      }else 
	      {
	    	  return false;
	      }
	
	}



}
