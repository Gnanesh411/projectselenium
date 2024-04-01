package ObjRepoOrEleClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	static WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public static WebElement pupularItems() {

		return driver.findElement(By.linkText("POPULAR ITEMS"));
	}
	public static WebElement Tablet() {

		return driver.findElement(By.id("details_16"));
	}
	public static WebElement LaptopLink() {

		return driver.findElement(By.id("details_10"));
	}
	public static WebElement speakerLink() {

		return driver.findElement(By.id("details_21"));
	}
	

}
