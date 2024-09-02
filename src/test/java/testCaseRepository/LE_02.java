package testCaseRepository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_02 extends BaseClass{
	@Test (groups = {"regression","smoke"})
	public void le_01tc() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 5, 1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads", 5, 2);
		String COMPANY=EUTIL.readDataFromExcel("Leads", 5, 3);
		String TOTLE=EUTIL.readDataFromExcel("Leads", 5, 4);
		String PHONE=EUTIL.readDataFromExcel("Leads", 5, 5);
		String MOB=EUTIL.readDataFromExcel("Leads", 5, 6);
		String EMAIL=EUTIL.readDataFromExcel("Leads", 5, 7);
		String NOE=EUTIL.readDataFromExcel("Leads", 5, 8);
		String STRET=EUTIL.readDataFromExcel("Leads", 5, 9);
		String POBOX=EUTIL.readDataFromExcel("Leads", 5, 10);
		String POSCODE=EUTIL.readDataFromExcel("Leads", 5, 11);
		String CITY=EUTIL.readDataFromExcel("Leads", 5, 12);
		String COUNTRY=EUTIL.readDataFromExcel("Leads", 5,13);
		String STATE=EUTIL.readDataFromExcel("Leads", 5, 14);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadsBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY, TOTLE, PHONE, MOB, EMAIL, NOE, STRET, POBOX, POSCODE, CITY, COUNTRY, STATE);
		Thread.sleep(4000);
}
}