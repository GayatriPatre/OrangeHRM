package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangeHRM.library.AdminUtils;
import orangeHRM.library.Employee;
import orangeHRM.library.Loginpage;

public class EmployeeRegistrationTest extends AdminUtils
{
	@Parameters({ "fname","lname"})
	@Test
 public void checkEmpReg( String fname,String lname)
 {
	 
	 Employee emp=new Employee();
	boolean res= emp.addEmployee(fname, lname);
	Assert.assertTrue(res);
	
 }
}
