package testCaseRepository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_04 extends BaseClass {
	@Test (groups = {"regression"})
	public void le_01tc() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 11, 1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads", 11, 2);
		String COMPANY=EUTIL.readDataFromExcel("Leads",11, 3);
		String STRET=EUTIL.readDataFromExcel("Leads",11, 4);
		String POBOX=EUTIL.readDataFromExcel("Leads", 11, 5);
		String POSCODE=EUTIL.readDataFromExcel("Leads",11, 6);
		String CITY=EUTIL.readDataFromExcel("Leads",11, 7);
		String COUNTRY=EUTIL.readDataFromExcel("Leads",11,8);
		String STATE=EUTIL.readDataFromExcel("Leads", 11, 9);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY, STRET, POBOX, POSCODE, CITY, COUNTRY, STATE);
		Thread.sleep(4000);
}

}