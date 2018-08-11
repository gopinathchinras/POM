package week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day2 {

//	public class AdvanceUserInterface extends SeMethods  {
//		@Test
//		public void userActions() {
//			startApp("chrome", "https://jqueryui.com/droppable/");
//			
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Desktop\\Testleaf\\Softwares-20180620T182359Z-001\\Softwares\\drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frame);
		driver.findElementById("sortable");
		WebElement eleItem1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		WebElement eleItem2 = driver.findElementByXPath("//ul[@id='sortable']/li[4]");
	    int i = eleItem2.getLocation().getX();
	    int y = eleItem2.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(eleItem1, i, y).perform();
		
		
		
		
		
		
		
		
//		WebElement eleDrag = driver.findElementById("draggable");
//		WebElement eleDrop = driver.findElementById("droppable");
//		Actions builder = new Actions(driver);
//		builder.dragAndDrop(eleDrag, eleDrop).perform();
//		
//		
	
		

	}

}
