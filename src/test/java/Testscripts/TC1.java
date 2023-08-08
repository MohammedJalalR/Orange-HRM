package Testscripts;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericscript.CSVSheet;
import genericscript.Launch;
import pomscripts.HomePom;
import pomscripts.LoginPom;

public class TC1 extends Launch {

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
		homePom.firstName(x.get(0));
		homePom.middleName(x.get(1));
		homePom.lastName(x.get(2));
		homePom.minclick();
		Thread.sleep(2000);
		homePom.savebtn();
		homePom.AddEmployeeList();
		homePom.EmployeeNameField(x.get(0) + " " + x.get(1));
		Thread.sleep(2000);
		homePom.search();
		String exp = homePom.locatetwinkle();
		Assert.assertEquals("Twinkle keshri", exp);
		homePom.dropdown();
		homePom.logout();

	}

}
