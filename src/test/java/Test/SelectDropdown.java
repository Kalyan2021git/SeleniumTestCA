package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	 static WebDriver driver;
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        
        //Select by visible Text
        WebElement monthDropdown=driver.findElement(By.name("birthday_month"));
        
        Select month = new Select(monthDropdown);
        		
        //month.selectByVisibleText("Dec");
        
        //show all the list vales in month drop down
        
        List<WebElement> dropdown = month.getOptions();
        
        for (int i=0;i<dropdown.size();i++) {
        	
        	System.out.println(dropdown.get(i).getText());
        }
        
        
        
        
        
        
	}

}
