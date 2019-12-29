package seleniumTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws Exception {
		WebDriver driver =FirstSeleniumTest.DriverInitiate();
		driver.get("https://www.google.com");
		
		
		takeSnapShot(driver, "C:\\Users\\Bikash\\eclipse-workspace\\AutomateSelenium\\test.png");
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination
		File DestFile=new File(fileWithPath);

        //Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

    }


}
