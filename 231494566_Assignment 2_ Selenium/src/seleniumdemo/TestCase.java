package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("harisamin594@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		String at = driver.getTitle();
		String et = "gmail";

		driver.close();

		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Successful!");
		}
		else
		{
			System.out.println("Test Failed!");
		}

	}

}
