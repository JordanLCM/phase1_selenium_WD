package phase1_selenium_WD001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phase1_WD001_TestSeleniumChromeIsWorking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");
		
		System.out.println("Chrome is starting!");
		
		WebDriver chromeD = new ChromeDriver();
		chromeD.get("http://automationpractice.com");
		
		WebElement signInLink = chromeD.findElement(By.className("login"));
		signInLink.click();
		Thread.sleep(1000);
		chromeD.findElement(By.id("email")).sendKeys("jordan123@mail.com");
		chromeD.findElement(By.id("passwd")).sendKeys("test123");
		chromeD.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(1000);
		WebElement errorMessage = chromeD.findElement(By.xpath("//p[normalize-space()='There is 1 error']"));
		WebElement errorMessage2 =  chromeD.findElement(By.xpath("//li[normalize-space()='Authentication failed.']"));
		if (errorMessage.getText().equals("There is 1 error")) {
			System.out.println(errorMessage.getText());
			System.out.println(errorMessage2.getText());
		}
		Thread.sleep(1500);
		chromeD.quit();
		
		System.out.println("Chrome is working!");
		System.out.println("Chrome has closed!");
	}
}
