package week3day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class CreadLead extends Annotations{
	@Test(groups = {"Smoke"})
	public void createLead() {
		
		try {
			WebElement eleCreate = locateElement("linktext", "Create Lead");
			click(eleCreate);
			WebElement eleComp = locateElement("createLeadForm_companyName");
			type(eleComp, "Testleaf");
			WebElement eleFirst = locateElement("createLeadForm_firstName");
			type(eleFirst, "Gopi");
			WebElement eleLast = locateElement("createLeadForm_lastName");
			type(eleLast, "K");
			WebElement eleSubmit = locateElement("class", "smallSubmit");
			click(eleSubmit);
			Thread.sleep(5000);
			selectDropDownUsingIndex(locateElement("createLeadForm_dataSourceId"), 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
