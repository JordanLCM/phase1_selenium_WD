package phase1_selenium_WD001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phase1_WD003_InternetHerokuappPracticeCheckBox {

	public static WebDriver chromeD;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");
		
		chromeD = new ChromeDriver();
		
		Phase1_WD003_InternetHerokuappPracticeCheckBox bAct = new Phase1_WD003_InternetHerokuappPracticeCheckBox();
		bAct.openURL();
		bAct.toCheckbox();
		bAct.closeDriver();
	}
	
	public void openURL() {
		System.out.println("Chrome is starting!");
		chromeD.manage().window().maximize();
		chromeD.get("https://the-internet.herokuapp.com");
	}
	
	public void toCheckbox() throws InterruptedException {
		System.out.println("Redirect to checkbox page");
		chromeD.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
		WebElement checkbox1 = chromeD.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		Thread.sleep(1000);
		if (!checkbox1.isSelected()) {
			checkbox1.click();
		}
		System.out.println(checkbox1.isSelected() + " & is now selected!");
		
		WebElement checkbox2 = chromeD.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		Thread.sleep(1000);
		if (checkbox2.isSelected()) {
			checkbox2.click();
		}
		System.out.println(checkbox2.isSelected() + " & is now de-selected!");
	}
	
	public void closeDriver() throws InterruptedException {
		Thread.sleep(1500);
		chromeD.close();
		System.out.println("Chrome has closed!");
	}
}
