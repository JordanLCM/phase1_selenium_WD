package phase1_selenium_WD001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Phase1_WD012_ActionBuilder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		WebDriver chromeD = new ChromeDriver();

		chromeD.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement fromE = chromeD.findElement(By.xpath("sample"));
		WebElement toE = chromeD.findElement(By.xpath("sample"));

		Actions builder = new Actions(chromeD);
		Action act = builder.clickAndHold(fromE).moveToElement(toE).release().build();
		act.perform();
		Thread.sleep(1500);
		chromeD.quit();
	}
}
