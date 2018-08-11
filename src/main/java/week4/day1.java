package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day1 {

//	public class AdvanceUserInterface extends SeMethods  {
//		@Test
//		public void userActions() {
//			startApp("chrome", "https://jqueryui.com/droppable/");
//			
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Desktop\\Testleaf\\Softwares-20180620T182359Z-001\\Softwares\\drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frame);
		
		WebElement eleDrag = driver.findElementById("draggable");
		WebElement eleDrop = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eleDrag, eleDrop).perform();
		
		
	
		

	}

}
