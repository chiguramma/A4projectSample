package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * business lib to click on new leads btn
 */
public class LeadsHomePage {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadsButton;

	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewLeadsButton() {
		return createNewLeadsButton;
	}
	/**
	 * business lib to click on new leads btn
	 */
	public void clickOnNewLeadsBtn()
	{
		createNewLeadsButton.click();
	}
}