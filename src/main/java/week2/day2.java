package week2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class day2 {
	@Test
public void test3 () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Desktop\\Testleaf\\Softwares-20180620T182359Z-001\\Softwares\\drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByLinkText("REGISTER").click();
		driver.findElementById("userName").sendKeys("Gopi");
		driver.findElementById("usrPwd").sendKeys("Gopo1987");
		driver.findElementById("cnfUsrPwd").sendKeys("Gopi1987");
//		Select dd = new Select(Select Security Question);
//		List<WebElement> alloptions = dd.getOptions();
//		dd.selectByIndex(1);
//        
		driver.findElementById("firstName").sendKeys("Chin");
		driver.findElementById("lastname").sendKeys("K");
		driver.findElementById("M").click();
		driver.findElementByClassName("ng-pristine ng-invalid ng-touched").click();
        
        		
        		
		

	}

}
