package cucumber2ndPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImplementationForFeature {
	public RemoteWebDriver driver;
	
	@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\TestLeaf-Selenium Course\\Software\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("Launch the URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Maximize the window")
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	@And("Set the timeout")
	public void setTimeOut() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@And("Enter the Username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	@And("Click the Login button")
	public void login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click the CRMSFA")
	public void clickCrmSfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click the Leads option")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click the Create Lead option")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter the First Name as (.*)")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	@And("Enter the Last Name as (.*)")
	public void enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@And("Enter the Company Name as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	@When("Click the Create button")
	public void clickCreate() {
		driver.findElementByName("submitButton").click();
	}
	@Then("Verify the successful creation of new lead")
	public void verifyCreation() {
		System.out.println("New Lead is successfully created");
	}
	@And("Close the browser")
	public void closeBrowser() {
		driver.quit();
		System.out.println("Browser instance is closed");
	}
}
