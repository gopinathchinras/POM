package week3;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day1 {

@Test

public void testNg() {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Desktop\\Testleaf\\Softwares-20180620T182359Z-001\\Softwares\\drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Gopi");
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
	    driver.findElementByXPath("//a[@id='tryhome']").click();
	     String title = driver.getTitle();
	     String url = driver.getCurrentUrl();
	    
	    System.out.println(title);
	    System.out.println(url);
	    
	    
	    
	    
//	    String secWin =driver.getWindowHandle();
	    
//	    driver.switchTo().window(secWin);
//	    String title = driver.getTitle();
//	     String url = driver.getCurrentUrl();
//	    
//	    System.out.println(title);
//	    System.out.println(url);
//	    
		
		
	}

}
