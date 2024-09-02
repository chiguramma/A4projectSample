package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.SeleniumUtility;

/**
 * this is pom class for homepage
 * @author trive
 * @version 1.8.24
 */
public class HomePage {
	
	@FindBy(xpath="(//a[text()='Leads'])[1]")
	private WebElement leads;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;
	
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement preferences;
	
	@FindBy(xpath="")
	private WebElement signoutOption;
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getPreferences() {
		return preferences;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	/**
	 * this is business lib to click on leads
	 */
	public void clickOnLeads() {
		leads.click();
		
	}
	/**
	 * this is business lib to click organizations
	 */
	public void ClicOnOrg() {
		org.click();
		
	}
	/**
	 * this is business lib to logout 
	 */
	public void logoutOperation(WebDriver driver) throws Exception {
		SeleniumUtility SUTIL=new SeleniumUtility();
		SUTIL.moveCursorToAnElement(driver,preferences);
		Thread.sleep(3000);
		SUTIL.moveCursorToAnElement(driver,signoutOption);
		SUTIL.clickOnAnElement(driver, signoutOption);
		
	}
}