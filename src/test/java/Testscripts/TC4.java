package Testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericscript.CSVSheet;
import genericscript.Launch;
import pomscripts.HomePom;
import pomscripts.LoginPom;

public class TC4 extends Launch {
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
		homePom.firstName(x.get(9));
		homePom.middleName(x.get(10));
		homePom.lastName(x.get(11));
		homePom.minclick();
		Thread.sleep(2000);
		homePom.savebtn();
		homePom.AddEmployeeList();
		homePom.EmployeeNameField(x.get(9) + " " + x.get(10));
		Thread.sleep(2000);
		homePom.search();
		String exp = homePom.locatebaraik();
		Assert.assertEquals("Baraik Sahil", exp);
		homePom.dropdown();
		homePom.logout();

	}
}
