package testCaseRepository;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;




public class ORG_04 extends BaseClass  {
	
		@Test
		public void org_04TC() throws Exception {
			JavaUtility JUTIL=new JavaUtility();
					int num=JUTIL.getRandomNumber(1000);
					ExcelUtil EUTIL=new ExcelUtil();
					String ORGName=EUTIL.readDataFromExcel("Organization", 11, 1);
					String WebSite=EUTIL.readDataFromExcel("Organization", 11, 2);
					String Employees=EUTIL.readDataFromExcel("Organization",11, 3);
					String PHONE=EUTIL.readDataFromExcel("Organization", 11, 4);
					String OTHERPHONE=EUTIL.readDataFromExcel("Organization", 11, 5);
					String EMAILID=EUTIL.readDataFromExcel("Organization", 11, 6);
					String BILLCITY=EUTIL.readDataFromExcel("Organization",11, 7);
					String BILLSTATE=EUTIL.readDataFromExcel("Organization",11, 8);
					HomePage hp=new HomePage(driver);
					hp.ClicOnOrg();
					OrgHomePage orghome=new OrgHomePage(driver);
					orghome.clickOnNewOrgBtn();
					CreateNewOrgPage cnorg= new CreateNewOrgPage(driver);
					cnorg.createOrganisation(ORGName, WebSite, Employees, PHONE, OTHERPHONE, EMAILID, BILLCITY, BILLSTATE);
					Thread.sleep(4000);
		}

	}
	



