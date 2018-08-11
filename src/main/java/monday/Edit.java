package monday;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotations;

public class Edit  extends Annotations{
	@Test(groups = {"sanity"})

	public void editLead() {

		try {
			WebElement cli = locateElement("linktext", "Create Contact");
			click(cli);
			WebElement first = locateElement("firstNameField");
			type(first, "gopi");
			WebElement last = locateElement("lastNameField");
			type(last, "k");
			WebElement firstL = locateElement("name", "firstNameLocal");
			type(firstL, "gopiF");
			WebElement lastL = locateElement("name", "lastNameLocal");
			type(lastL, "gopiL");
			WebElement sal = locateElement("createContactForm_personalTitle");
			type(sal, "salu");
			WebElement title = locateElement("name", "generalProfTitle");
			type(title, "Tl");
			WebElement dep = locateElement("name", "departmentName");
			type(dep, "IT");
			WebElement dd = locateElement("createContactForm_preferredCurrencyUomId");
			selectDropDownUsingText(dd, "INR - Indian Rupee");
			WebElement des = locateElement("createContactForm_description");
			type(des, "hi how r u?");
			WebElement note = locateElement("createContactForm_importantNote");
			type(note, "good");
			WebElement areacode = locateElement("createContactForm_primaryPhoneAreaCode");
			type(areacode, "600020");
			WebElement exten = locateElement("createContactForm_primaryPhoneExtension");
			type(exten, "the");
			WebElement email = locateElement("createContactForm_primaryEmail");
			type(email, "chin@gmail.com");
			WebElement phone = locateElement("createContactForm_primaryPhoneNumber");
			type(phone, "9962192121");
			WebElement askfor = locateElement("createContactForm_primaryPhoneAskForName");
			type(askfor, "fsf");
			WebElement generalToname = locateElement("generalToNameField");
			String text = generalToname.getText();
			System.out.println(text);
			WebElement ad1 = locateElement("createContactForm_generalAddress1");
			type(ad1, "L B Road");
			WebElement city = locateElement("name", "generalCity");
			type(city, "chennai");
			WebElement zip = locateElement("name", "generalPostalCode");
			type(zip, "20");
			WebElement extension = locateElement("name", "generalPostalCodeExt");
			type(extension, "gsg");
			WebElement attn = locateElement("createContactForm_generalAttnName");
			type(attn, "s");
			WebElement ad2 = locateElement("createContactForm_generalAddress2");
			type(ad2, "ady");
			WebElement dd2 = locateElement("name", "generalCountryGeoId");
			selectDropDownUsingText(dd2, "India");
			WebElement state = locateElement("createContactForm_generalStateProvinceGeoId");
			selectDropDownUsingText(state, "District of Columbia");
			WebElement create = locateElement("xpath", "//input[@value='Create Contact']");
			click(create);
			WebElement rename = locateElement("viewContact_firstName_sp");
			verifyPartialText(rename, text);

			WebElement edit = locateElement("linktext", "Edit");
			click(edit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
















	}



}


