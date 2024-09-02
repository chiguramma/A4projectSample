package testCaseRepository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_03 extends BaseClass {
	@Test (groups = {"sanity"})	
	public void le_03tc() throws Exception {
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtil EUTIL=new ExcelUtil();
	String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 8, 1);
	String LASTNAME=EUTIL.readDataFromExcel("Leads", 8, 2);
	String COMPANY=EUTIL.readDataFromExcel("Leads", 8, 3);
	String TOTLE=EUTIL.readDataFromExcel("Leads", 8, 4);
	String PHONE=EUTIL.readDataFromExcel("Leads", 8, 5);
	String MOB=EUTIL.readDataFromExcel("Leads", 8, 6);
	String EMAIL=EUTIL.readDataFromExcel("Leads", 8, 7);
	String NOE=EUTIL.readDataFromExcel("Leads", 8, 8);
	HomePage hp=new HomePage(driver);
	hp.clickOnLeads();
	LeadsHomePage lp=new LeadsHomePage(driver);
	lp.clickOnNewLeadsBtn();
	CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
	cn.createLeads(FIRSTNAME+num, LASTNAME, COMPANY, TOTLE, PHONE, MOB, EMAIL, NOE);
	Thread.sleep(4000);
	
	}
}