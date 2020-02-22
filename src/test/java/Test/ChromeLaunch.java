package Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		//Chrome browser launch 	
	    System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        
        //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mr.kalyanmondal@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("a3m3i3t3");
       // driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        //Male radio button Is displayed/enabled/selected
        
//       WebElement maleradiobutton =driver.findElement(By.id("u_0_a"));
//       
//       boolean status=  maleradiobutton.isDisplayed();  
//       System.out.println("male radio button is displayed>>" +status);
//       
//       boolean status1=  maleradiobutton.isEnabled();  
//       System.out.println("male radio button is Enabled>>" +status1);
//       
//       boolean status3=  maleradiobutton.isSelected();  
//       System.out.println("male radio button is Selected>>" +status3);
//       
//       driver.findElement(By.id("u_0_a")).click();
//       
//       System.out.println("Radio button is now clicked ");
//       
//       boolean status4=  maleradiobutton.isSelected();  
//       System.out.println("male radio button is Selected>>" +status4);
//       
       //getscreenshot();
                  
       driver.close();
              
      	}
	
	/* public static void getscreenshot() throws Exception 
     {
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File("C:\\Users\\kalya_000\\eclipse-workspace\\TestSelenium\\target\\screenshot.jpeg"));
     }
     
     
     */
				
}