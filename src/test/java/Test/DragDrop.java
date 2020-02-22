package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        
        
        WebElement drag = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement drop = driver.findElement(By.className("placeholder"));
        
        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop).build().perform();
        
       // driver.close();
		
		

	}

}
