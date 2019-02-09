package gitMaster;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.annotations.VisibleForTesting;

public class Gitmaster {
@Test
public void logintest() throws IOException{
	WebDriver wd= new FirefoxDriver();
	wd.get("https://www.google.com/");
	File src= ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\workspace\\WebdriveTest\\screenshot\\gitmaster.jpg"));
	
}
}
