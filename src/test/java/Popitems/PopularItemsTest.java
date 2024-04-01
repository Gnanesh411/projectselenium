package Popitems;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ExcelData.ExceldataDriven;
import ObjRepoOrEleClass.HomePage;
import ObjRepoOrEleClass.ProductDetails;
import commonMethods.ScreenShot;
import testBase.BrowserLaunch;

public class PopularItemsTest extends BrowserLaunch{

	static HomePage hp;
	static ProductDetails pd;
	static ScreenShot sc;
	static ExceldataDriven excel;

	@BeforeTest
	public static void Starttest() {
		System.out.println("*****TEST STARTED*****");
	}

	@BeforeMethod
	public static void openbrowser() {
		BrowserLaunch bl = new BrowserLaunch();
		bl.launchBrowser("firefox");
	}

	@Test
	public static void tablettest() throws InterruptedException, IOException {

		hp = new HomePage(driver);
		pd = new ProductDetails(driver);
		sc = new ScreenShot();

		Thread.sleep(10000);
		hp.pupularItems().click();
		hp.Tablet().click();
		String TabletactualText = pd.productdetails().getText();
		excel = new ExceldataDriven();
		String expectedtablettext = excel.readdata(1, 0);

		if(TabletactualText.contains(expectedtablettext)) {

			excel.writedata(1, 1, "valid data");
			
		}else {
			
			excel.writedata(1, 1, "invalid data");
			sc.scshot();
		}
	}

	@Test
	public static void laptoptest() throws InterruptedException, IOException {
		
		hp = new HomePage(driver);
		pd = new ProductDetails(driver);
		Thread.sleep(10000);
		hp.pupularItems().click();
		hp.LaptopLink().click();
		String actullaptoptext = pd.productdetails().getText();
		String expectedlaptoptext = excel.readdata(2, 0);

		if(actullaptoptext.contains(expectedlaptoptext)) {
			excel.writedata(2, 1, "valid data");
		}else {
			excel.writedata(2, 1, "invalid data");
			sc.scshot();
		}
	}

	@Test
	public static void spkrtest() throws InterruptedException, IOException {
		
		hp = new HomePage(driver);
		pd = new ProductDetails(driver);
		Thread.sleep(10000);
		hp.pupularItems().click();
		hp.speakerLink().click();
		String actullaptoptext = pd.productdetails().getText();
		String expectedlaptoptext = excel.readdata(3, 0);

		if(actullaptoptext.contains(expectedlaptoptext)) {
			excel.writedata(3, 1, "valid data");
		}else {
			excel.writedata(3, 1, "invalid data");
			sc.scshot();
		}
	}

	@AfterMethod
	public static void closebrowser() {
		driver.close();
	}
	
	@AfterTest
	public static void endtest() {
		System.out.println("****Test Ended****");
	}




}


