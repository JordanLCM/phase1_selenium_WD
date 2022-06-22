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

public class Phase1_WD009_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		WebDriver chromeD = new ChromeDriver();
		
		chromeD.get("https://the-internet.herokuapp.com/javascript_alerts");
		chromeD.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		chromeD.switchTo().alert().accept();
		System.out.println(chromeD.findElement(By.xpath("//p[@id='result']")).getText());
		
		chromeD.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(1000);
		chromeD.switchTo().alert().accept();
		System.out.println(chromeD.findElement(By.xpath("//p[@id='result']")).getText());
		Thread.sleep(1000);
		chromeD.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(1000);
		chromeD.switchTo().alert().dismiss();
		System.out.println(chromeD.findElement(By.xpath("//p[@id='result']")).getText());
		
		chromeD.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(1000);
		chromeD.switchTo().alert().sendKeys("Hello!!!");
		Thread.sleep(1000);
		chromeD.switchTo().alert().accept();
		System.out.println(chromeD.findElement(By.xpath("//p[@id='result']")).getText());
		
		Thread.sleep(1500);
		chromeD.quit();
	}
}
