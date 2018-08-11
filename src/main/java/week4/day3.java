package week4;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class day3 extends SeMethods {

	@Test
	public void flipkartLogin() {
		startApp("chrome", "https://www.flipkart.com/");
	     WebElement eleClose = locateElement("xpath", "//button[text()='✕']");
	     click(eleClose);
	     WebElement ele1 = locateElement("xpath", "//span[text()='Electronics']");
	     
	     WebElement ele2 = locateElement("xpath", "//span[text()='Apple']");
	     actions(ele1, ele2);
	     







}
}