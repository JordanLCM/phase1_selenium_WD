package phase1_selenium_WD001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phase1_WD007_ListOf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");
		
		WebDriver chromeD = new ChromeDriver();
		
		chromeD.manage().window().maximize();
		chromeD.get("https://www.moneycontrol.com/");
		WebElement listElement =  chromeD.findElement(By.xpath("//ul[@class='clearfix main_nav']"));
		
		List<WebElement> listOfLi = listElement.findElements(By.tagName("li"));
		for(WebElement WebE : listOfLi) {
			System.out.println(WebE.getText());
		}
		
		Thread.sleep(1500);
		chromeD.quit();
	}
}
