package commonMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testBase.BrowserLaunch;

public class ScreenShot extends BrowserLaunch {

	public static void scshot() throws IOException {

		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Users\\gnane\\eclipse-workspace\\seleniumprojectnew\\resources\\screenshot\\error1.png"));
	}


}
