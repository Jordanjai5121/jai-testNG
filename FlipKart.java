package day5;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class FlipKart {

	public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input").sendKeys("7667418140");
			driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input").sendKeys("Jaisriram5121");
			driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button").click();
			
			WebElement d1=driver.findElement(By.xpath("//div[text()='Home']"));
			Actions a1=new Actions(driver);
			a1.click(d1);
		}	

}
