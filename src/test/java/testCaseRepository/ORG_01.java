package testCaseRepository;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_01  extends BaseClass {
 
	
	@Test
	public void org_01Tc() throws Exception  {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtil EUTIL=new ExcelUtil();
		String ORG_Name=EUTIL.readDataFromExcel("Organization", 2, 1);
		String WebSite=EUTIL.readDataFromExcel("Organization", 2, 2);
		String Employees=EUTIL.readDataFromExcel("Organization", 2, 3);
		HomePage hp=new HomePage(driver);
		hp.ClicOnOrg();
		OrgHomePage orghome=new OrgHomePage(driver);
		orghome.clickOnNewOrgBtn();
		CreateNewOrgPage cnorg= new CreateNewOrgPage(driver);
		cnorg.createOrganisation(ORG_Name, WebSite, Employees);
		Thread.sleep(4000);		
	}

}





