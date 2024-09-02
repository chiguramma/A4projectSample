package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName ;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company ;
	
	@FindBy(xpath="//input[@id='designation']")
	private WebElement title ;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone ;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath="//textarea[@name=\"lane\"]")
	private WebElement street;
	
	@FindBy(xpath="//input[@name=\"pobox\"]")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name=\"code\"]")
	private WebElement postalCode ;
	
	@FindBy(xpath="//input[@name=\"city\"]")
	private WebElement City ;
	
	@FindBy(xpath="//input[@name=\"country\"]")
	private WebElement  country;

	@FindBy(xpath="//input[@name=\"state\"]")
	private WebElement  state;
	

	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement  saveBtn;
	

	public CreateNewLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * this is business lib  create an leads for tc_01
	 * @param fName
	 * @param lName
	 * @param Comp
	 */
	
	public void createLeads(String fName,String lName,String Comp) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(Comp);
		saveBtn.click();
		
	}
	/**
	 * this is business lib  create an leads for tc_02
	 * @param fName
	 * @param lName
	 * @param Comp
	 * @param Titlee
	 * @param Phonee
	 * @param mobilee
	 * @param emailid
	 * @param noOfEmp
	 * @param streett
	 * @param postbox
	 * @param postcode
	 * @param cityy
	 * @param Countryy
	 * @param statee
	 */
	public void createLeads(String fName,String lName,String Comp,String Titlee,String Phonee,String mobilee,String emailid,String noOfEmp,String streett,String postbox,String postcode,String cityy,String Countryy,String statee) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(Comp);
		title.sendKeys(Titlee);
		phone.sendKeys(Phonee);
		mobile.sendKeys(mobilee);
		email.sendKeys(emailid);
		noOfEmployees.sendKeys(noOfEmp);
		street.sendKeys(streett);
		poBox.sendKeys(postbox);
		postalCode.sendKeys(postcode);
		City.sendKeys(cityy);
		country.sendKeys(Countryy);
		state.sendKeys(statee);
		saveBtn.click();

	}
	/**
	 * this is business lib  create an leads for tc_03
	 * @param fName
	 * @param lName
	 * @param Comp
	 * @param Titlee
	 * @param Phonee
	 * @param mobilee
	 * @param emailid
	 * @param noOfEmp
	 */
	public void createLeads(String fName,String lName,String Comp,String Titlee,String Phonee,String mobilee,String emailid,String noOfEmp) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(Comp);
		title.sendKeys(Titlee);
		phone.sendKeys(Phonee);
		mobile.sendKeys(mobilee);
		email.sendKeys(emailid);
		noOfEmployees.sendKeys(noOfEmp);
		saveBtn.click();

	}
	/**
	 * this is business lib  create an leads for tc_04
	 * @param fName
	 * @param lName
	 * @param Comp
	 * @param streett
	 * @param postbox
	 * @param postcode
	 * @param cityy
	 * @param Countryy
	 * @param statee
	 */
	public void createLeads(String fName,String lName,String Comp,String streett,String postbox,String postcode,String cityy,String Countryy,String statee) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		company.sendKeys(Comp);
		street.sendKeys(streett);
		poBox.sendKeys(postbox);
		postalCode.sendKeys(postcode);
		City.sendKeys(cityy);
		country.sendKeys(Countryy);
		state.sendKeys(statee);
		saveBtn.click();

	}
}