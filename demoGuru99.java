package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoGuru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement s1=driver.findElementByXPath("//*[@id=\"fourth\"]/a");
		WebElement s2=driver.findElementByXPath("//*[@id=\"fourth\"]/a");
		WebElement s3=driver.findElementByXPath("//*[@id=\"credit2\"]/a");
		WebElement s4=driver.findElementByXPath("//*[@id=\"credit1\"]/a");
		Actions drag = new Actions (driver);
		WebElement drop1 =driver.findElementByXPath("//*[@id=\"amt7\"]/li");
		WebElement drop2 =driver.findElementByXPath("//*[@id=\"amt8\"]/li");
		WebElement drop3 =driver.findElementByXPath("//*[@id=\"bank\"]/li");
		WebElement drop4 =driver.findElementByXPath("//*[@id=\"loan\"]/li");
		drag.dragAndDrop(s1, drop1).perform();
		drag.dragAndDrop(s2, drop2).perform();
		drag.dragAndDrop(s3, drop3).perform();
		drag.dragAndDrop(s4, drop4).perform();
}
}