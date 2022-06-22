package phase1_selenium_WD001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phase1_WD011_iFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		WebDriver chromeD = new ChromeDriver();

		chromeD.get("https://the-internet.herokuapp.com/frames");
		chromeD.findElement(By.xpath("//a[normalize-space()='iFrame']")).click();
		WebElement frame1 = chromeD.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		chromeD.switchTo().frame(frame1);
		WebElement content1 = chromeD.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
		System.out.println(content1.getText());
		content1.clear();
		content1.sendKeys("Hello world!");
		chromeD.switchTo().defaultContent();

		Thread.sleep(1500);
		chromeD.quit();
	}
}
