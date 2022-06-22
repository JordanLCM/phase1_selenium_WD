package phase1_selenium_WD001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phase1_WD002_BrowserAct {

	public static WebDriver chromeD;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jordan Liu\\eclipse-workspace\\phase1_selenium_WD\\Chrome\\chromedriver.exe");

		chromeD = new ChromeDriver();
		Phase1_WD002_BrowserAct bAct = new Phase1_WD002_BrowserAct();
		//technically what this does is to allow usage of all the methods in this class
		bAct.openURL();
		bAct.goToDresses();
//		bAct.refreshPage();
//		bAct.backToPage();
//		bAct.refreshPage();
//		bAct.forwardToPage();
		bAct.getCSSValue();
		bAct.closeDriver();
	}

	public void openURL() {
		System.out.println("Chrome is starting!");
		chromeD.manage().window().maximize();
		chromeD.get("http://automationpractice.com");
	}

	public void closeDriver() throws InterruptedException {
		Thread.sleep(1500);
		chromeD.close();
		System.out.println("Chrome has closed!");
	}

	public void goToDresses() {
		chromeD.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();	
		}
	
	public void backToPage() throws InterruptedException {
		Thread.sleep(1500);
		chromeD.navigate().back();
		}
	
	public void forwardToPage() throws InterruptedException {
		Thread.sleep(1500);
		chromeD.navigate().forward();
		}
	
	public void refreshPage() throws InterruptedException {
		Thread.sleep(1500);
		chromeD.navigate().refresh();
	}
	
	public void getCSSValue() throws InterruptedException {
		Thread.sleep(1500);
		WebElement colorBox = chromeD.findElement(By.id("layered_id_attribute_group_14"));
		System.out.println("Color RGB = " + colorBox.getCssValue("background"));
		System.out.println("Border = " + colorBox.getCssValue("border"));
		System.out.println("Height = " + colorBox.getCssValue("height"));
		System.out.println("Width = " + colorBox.getCssValue("width"));
		System.out.println("Class = " + colorBox.getAttribute("class"));
		System.out.println("Style = " + colorBox.getAttribute("style"));
		System.out.println("Tagname = " + colorBox.getTagName());
	}
}
