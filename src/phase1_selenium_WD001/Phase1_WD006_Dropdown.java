package phase1_selenium_WD001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phase1_WD006_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");
		
		WebDriver chromeD = new ChromeDriver();
		
		chromeD.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropD =  chromeD.findElement(By.id("dropdown"));
		
		Select select1 = new Select(dropD);
		System.out.println(select1.getFirstSelectedOption());
		Thread.sleep(1500);
		select1.selectByVisibleText("Option 1");
		Thread.sleep(1500);
		select1.selectByIndex(2);
		Thread.sleep(1500);
		chromeD.quit();
	}
}
