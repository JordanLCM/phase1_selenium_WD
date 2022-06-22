package phase1_selenium_WD001;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phase1_WD010_WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		WebDriver chromeD = new ChromeDriver();
		
		chromeD.get("https://the-internet.herokuapp.com/windows");
//		System.out.println(chromeD.getWindowHandle());
		Thread.sleep(1000);
		String parentWH = chromeD.getWindowHandle();
		chromeD.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
//		chromeD.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		Thread.sleep(1500);
		Set<String> windowHandles = chromeD.getWindowHandles();
		System.out.println(windowHandles.size());
		Iterator<String> iterate = windowHandles.iterator();
		while(iterate.hasNext()) {
			String winH = iterate.next();
			chromeD.switchTo().window(winH);
			System.out.println(winH);
		}
		System.out.println(chromeD.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText());
		chromeD.close();
		chromeD.switchTo().window(parentWH);
		
		chromeD.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Thread.sleep(1500);
		chromeD.quit();
	}
}
