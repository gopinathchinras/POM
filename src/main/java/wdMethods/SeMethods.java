package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();

	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id": 	  return driver.findElementById(locValue);
		case "class": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);
		case "linktext" : return driver.findElementByLinkText(locValue);
		case "name": return driver.findElementByName(locValue);
		case "tagname": return driver.findElementByTagName(locValue);
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is Entered Successfully");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();		
	}

	public String getText(WebElement ele) {
		String text= ele.getText();
		System.out.println(text);
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select ddi = new Select(ele);
		ddi.selectByIndex(index);


	}

	public boolean verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		if (title.equals(expectedTitle)) {
			System.out.println();
		} else {
			System.out.println();
		}
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if (text.equals(expectedText)) {
			System.out.println("The Text matched");
		} else {
			System.out.println("The Text is not matched");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if (text.contains(expectedText)) {
			System.out.println("The Text matched");
		} else {
			System.out.println("The Text is not matched");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String aa = ele.getAttribute(attribute);
		if (aa.equals(value)) {

		} else {

		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public boolean verifySelected(WebElement ele) {

		boolean selected = ele.isSelected();
		if (ele.isSelected()) {
			System.out.println("check box is selected");
			return true;
		} else {
			System.out.println("check box is not selected");
		}
		return false;

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
      
		Set<String> allWindows = driver.getWindowHandles();
		List<String> each = new ArrayList<String>();
		each.addAll(allWindows);
		driver.switchTo().window(each.get(index));
		
	}

	public void switchToFrame(WebElement ele) {
		

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

	@Override
	public void actions(WebElement ele1 , WebElement ele2) {
		Actions builder = new Actions(driver);
		builder.moveToElement(ele1).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele2));
		builder.click(ele2).perform();
	}

}







