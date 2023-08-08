package Testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericscript.CSVSheet;
import genericscript.Launch;
import pomscripts.HomePom;
import pomscripts.LoginPom;

public class TC3 extends Launch {
	@Test
	void Tc1() throws Exception {
		LoginPom loginPom = new LoginPom(driver);
		loginPom.username("Admin");
		loginPom.password("admin123");
		loginPom.loginbtn();
		HomePom homePom = new HomePom(driver);
		homePom.pimhovering(driver);
		homePom.pim();
		homePom.addEmp();
		ArrayList<String> x = CSVSheet.fetch();
		homePom.firstName(x.get(6));
		homePom.middleName(x.get(7));
		homePom.lastName(x.get(8));
		homePom.minclick();
		Thread.sleep(2000);
		homePom.savebtn();
		homePom.AddEmployeeList();
		homePom.EmployeeNameField(x.get(6)+" "+x.get(7));
		Thread.sleep(2000);
		homePom.search();
		String exp = homePom.locatepriyajit();
		Assert.assertEquals("Priyajit Samanta", exp);
		homePom.dropdown();
		homePom.logout();
	}

}
