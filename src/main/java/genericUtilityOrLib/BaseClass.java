package genericUtilityOrLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {
	public static WebDriver driver=null;
	SeleniumUtility SUTIL=null;
	PropertiesUtility PUTIL=new PropertiesUtility();
	
	
	@BeforeSuite(alwaysRun=true)
	public void createConnection() throws Exception {
		System.out.println("connection estlablish");
		Thread.sleep(4000);
	}
	/**
	 * cross BrowserCheck
	 * @throws Exception
	 */
	/* ---------------------------------only for Cross browser checking----------------------
	 * @Parameters("browser")
	 * 
	 * @BeforeClass(alwaysRun=true) public void launchBrowser1(String browser)
	 * throws Exception { String URL=PUTIL.getDataFromProperties("url"); SUTIL=new
	 * SeleniumUtility(); if(browser.contains("chrome")) { driver=new
	 * ChromeDriver(); System.out.println("chromeBrowser");}
	 * if(browser.contains("firefox")) { driver=new FirefoxDriver();
	 * System.out.println("firefox");} SUTIL.implictWait(driver,10);
	 * SUTIL.maximizeWindow(driver); driver.get(URL);
	 * //System.out.println("Launching Browser Success");
	 * 
	 * }
	 */
	
	/**
	 * for cross browser  checking we need to comment this launchBroser method
	 * @throws Exception
	 */
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception {
		String  URL=PUTIL.getDataFromProperties("url");
		SUTIL=new SeleniumUtility();
		driver=new ChromeDriver();
		SUTIL.implictWait(driver,10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("Launching Browser Success");
		
	}
	@BeforeMethod(alwaysRun=true)
	public void loginApp() throws Exception {
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginoperation(USERNAME, PASSWORD);
		System.out.println("loginSuccessfully");

		
	}
	@AfterMethod(alwaysRun=true)
	public void logoutApp() throws Exception {
		HomePage hp=new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("logout successfully");
	
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
		System.out.println("browser closed Successfully");
		
	}
	@AfterSuite(alwaysRun=true)
	public void closeConnection() {
		System.out.println("Connection Closed successfully");
		
	}


}