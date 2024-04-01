package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserLaunch {

	protected static WebDriver driver;

	public static void launchBrowser(String browser) {
		//String browser="chrome";

		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.advantageonlineshopping.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
		}else if(browser.equals("chrome")){
			driver = new ChromeDriver();
			driver.get("https://www.advantageonlineshopping.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
		}else if(browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.advantageonlineshopping.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
		}




	}
}
