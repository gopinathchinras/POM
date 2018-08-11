package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finddropdowm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopi\\Desktop\\Testleaf\\Softwares-20180620T182359Z-001\\Softwares\\drivers\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		/*driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");;
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		List<WebElement> dd2 = driver.findElementsByTagName("Select");
		int size = dd2.size();
		System.out.println(size);
		driver.close();
		
*/
		WebElement table = driver.findElementByXPath("//div[@id='contentblock']//table");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement tablexpath = driver.findElementByXPath("//div[@id='contentblock']//table//tr[2]");
		List<WebElement> col = tablexpath.findElements(By.tagName("td"));
		int sizeRows = rows.size();
		int sizecol = col.size();
		System.out.println("No of rows" + sizeRows);
		System.out.println("No of Cols" + sizecol);
		
		WebElement colValue = driver.findElementByXPath("//div[@id='contentblock']//table//tr[3]//td[1]/following::td[1]");
		String text = colValue.getText();
		System.out.println("Progress value : "+text);
		
		}

}
