package seleniumprojectnew;

import testBase.BrowserLaunch;

public class BrowserL extends BrowserLaunch {

	public static void main(String[] args) {

		BrowserLaunch bl = new BrowserLaunch();
		bl.launchBrowser("firefox");
		System.out.println(driver.getTitle());

	}

}
