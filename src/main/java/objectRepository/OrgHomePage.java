package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for orghomepage
 */
public class OrgHomePage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createNewOrgButton;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewOrgButton() {
		return createNewOrgButton;
	}
	/**
	 *  business lib to click on new leads btn

	 */
	public void clickOnNewOrgBtn()
	{
		createNewOrgButton.click();
	}
}