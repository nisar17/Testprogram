import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class testClass {

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hellow world");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.google.com");
driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(scr,new File( "D:\\nisar.jpeg"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.quit();

}}