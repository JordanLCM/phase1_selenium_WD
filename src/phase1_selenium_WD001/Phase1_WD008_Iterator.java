package phase1_selenium_WD001;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phase1_WD008_Iterator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		WebDriver chromeD = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) chromeD;
		
		chromeD.manage().window().maximize();
		chromeD.get("https://www.moneycontrol.com/");
		WebElement tableElement = chromeD.findElement(By.xpath("//div[@id='maNSE']//table[@class='rhsglTbl']"));

		js.executeScript("arguments[0].scrollIntoView();", tableElement);
		
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		List<WebElement> columns;
		for (WebElement rowE : rows) {
			columns = rowE.findElements(By.tagName("td"));
			for (WebElement colE : columns) {
				System.out.println(colE.getText());
			}
			System.out.println("-------------------------");
		}

		Thread.sleep(1500);
		chromeD.quit();
	}
}
