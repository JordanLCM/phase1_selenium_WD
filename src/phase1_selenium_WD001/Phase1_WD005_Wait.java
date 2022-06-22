package phase1_selenium_WD001;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phase1_WD005_Wait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");
		
		WebDriver chromeD = new ChromeDriver();
		
		chromeD.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		chromeD.findElement(By.xpath("//button[normalize-space()='Start']")).click();
		
//		chromeD.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(chromeD, 5);
		WebElement textToRead = chromeD.findElement(By.xpath("//h4[normalize-space()='Hello World!']"));
		
		wait.until(ExpectedConditions.visibilityOf(textToRead));
		
		System.out.println(textToRead.getText());
		
		chromeD.quit();
	}
}
