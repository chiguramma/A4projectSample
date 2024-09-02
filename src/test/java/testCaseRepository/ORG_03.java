package testCaseRepository;


import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtil;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_03 extends BaseClass {

		@Test
		public void org_03TC() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
				int num=JUTIL.getRandomNumber(1000);
				ExcelUtil EUTIL=new ExcelUtil();
				String ORG_Name=EUTIL.readDataFromExcel("Organization", 8, 1);
				String WebSite=EUTIL.readDataFromExcel("Organization", 8, 2);
				String BILLADDRESS=EUTIL.readDataFromExcel("Organization", 8, 3);
				String BILLCITY=EUTIL.readDataFromExcel("Organization", 8, 4);
				String BILLSTATE=EUTIL.readDataFromExcel("Organization", 8, 5);
				HomePage hp=new HomePage(driver);
				hp.ClicOnOrg();
				OrgHomePage orghome=new OrgHomePage(driver);
				orghome.clickOnNewOrgBtn();
				CreateNewOrgPage cnorg= new CreateNewOrgPage(driver);
				cnorg.createOrganisation(ORG_Name, WebSite, BILLADDRESS, BILLCITY, BILLSTATE);
				Thread.sleep(4000);
			
			
		} 

	}

