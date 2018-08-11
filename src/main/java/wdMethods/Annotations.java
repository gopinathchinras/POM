package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Annotations extends SeMethods{
	
	@BeforeMethod(groups = {"Common"})
	
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		WebElement user = locateElement("username");
		type(user, "demosalesmanager");
		WebElement pass = locateElement("password");
		type(pass, "crmsfa");
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crm = locateElement("linktext", "CRM/SFA");
		click(crm);
		
		
	}
	
	@AfterMethod(groups = {"Common"})
	public void close() {
		closeBrowser();
	}
	

}
