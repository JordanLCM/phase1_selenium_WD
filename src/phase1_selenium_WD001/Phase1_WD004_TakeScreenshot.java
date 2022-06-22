package phase1_selenium_WD001;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phase1_WD004_TakeScreenshot {

	public static WebDriver chromeD;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		chromeD = new ChromeDriver();

		Phase1_WD004_TakeScreenshot bAct = new Phase1_WD004_TakeScreenshot();
		bAct.openURL();
		bAct.takeScreenShot("Herokuapp");
		bAct.closeDriver();
	}

	public void openURL() {
		System.out.println("Chrome is starting!");
		chromeD.manage().window().maximize();
		chromeD.get("https://the-internet.herokuapp.com");
	}

	public void takeScreenShot(String fileName) {
		File screenShot = ((TakesScreenshot) chromeD).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot,
					new File("/Users/Jordan Liu/eclipse-workspace/phase1_selenium_WD/Screenshot/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void closeDriver() throws InterruptedException {
		Thread.sleep(1500);
		chromeD.close();
		System.out.println("Chrome has closed!");
	}
}
