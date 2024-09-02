package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement webSite;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employees;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phn;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhn ;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name=\"bill_street\"]")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='bill_city']")
	private WebElement billingCity ;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
	private WebElement saveBtn;


	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}


	public WebElement getOrgName() {
		return orgName;
	}


	public WebElement getWebSite() {
		return webSite;
	}


	public WebElement getEmployees() {
		return employees;
	}


	public WebElement getPhn() {
		return phn;
	}


	public WebElement getOtherPhn() {
		return otherPhn;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getBillingAddress() {
		return billingAddress;
	}


	public WebElement getBillingCity() {
		return billingCity;
	}


	public WebElement getBillingState() {
		return billingState;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}
/**
 * this is the business lib to create an organisation for tc_01
 * @param organization
 * @param web
 * @param emp
 */
public void createOrganisation(String organization,String web,String emp) {
	orgName.sendKeys(organization);
	webSite.sendKeys(web);
	employees.sendKeys(emp);
	saveBtn.click();

}
/**
 *  this is the business lib to create an organisation for tc_02
 * @param organization
 * @param web
 * @param emp
 * @param phno
 * @param otherPhno
 * @param emailId
 */
public void createOrganisation(String organization,String web,String emp,String phno,String otherPhno,String emailId) {
	orgName.sendKeys(organization);
	webSite.sendKeys(web);
	employees.sendKeys(emp);	
	phn.sendKeys(phno);
	otherPhn.sendKeys(otherPhno);
	email.sendKeys(emailId);
	saveBtn.click();

}
/**
 * this is the business lib to create an organisation for tc_03
 * @param organization
 * @param web
 * @param bilAdd
 * @param bilCity
 * @param BilState
 */
public void createOrganisation(String organization,String web,String bilAdd,String bilCity,String BilState) {
	orgName.sendKeys(organization);
	webSite.sendKeys(web);
	billingAddress.sendKeys(bilAdd);
	billingCity.sendKeys(bilCity);
	billingState.sendKeys(BilState);
	saveBtn.click();


}

/**
 * this is the business lib to create an organisation for tc_04
 * 
 * @param organization
 * @param web
 * @param emp
 * @param phno
 * @param otherPhno
 * @param bilCity
 * @param BilState
 */
public void createOrganisation(String organization,String web,String emp,String phno,String otherPhno ,String emailId,String bilCity,String BilState) {
	orgName.sendKeys(organization);
	webSite.sendKeys(web);
	employees.sendKeys(emp);
	phn.sendKeys(phno);
	otherPhn.sendKeys(otherPhno);
	email.sendKeys(emailId);
	billingCity.sendKeys(bilCity);
	billingState.sendKeys(BilState);
	saveBtn.click();

}
}