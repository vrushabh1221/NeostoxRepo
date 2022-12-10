package com.ns.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.ns.testBase.TestBaseClass;

public class CommonClass extends TestBaseClass {
	
	public static void Screnshot(String filename)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\user\\eclipse-workspace\\Neostox2\\Screenshot"+filename+".png"+System.currentTimeMillis());
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
