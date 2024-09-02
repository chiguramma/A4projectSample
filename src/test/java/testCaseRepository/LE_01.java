package testCaseRepository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_01 extends BaseClass {
	@Test (groups = {"regression"})
	public void le_01tc() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 2, 1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads", 2, 2);
		String COMPANY=EUTIL.readDataFromExcel("Leads", 2, 3);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY);
		Thread.sleep(4000);	
	}

}