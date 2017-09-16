package KeywordDriven.Selenium.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import KeywordDriven.Selenium.Data.excelReader;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Resources {
	
	
	public static WebDriver dr;
	public static EventFiringWebDriver driver;
	public static Properties Repository = new Properties();
	public static Properties Config = new Properties();
	public static Properties AppText = new Properties();
	public static excelReader SuiteData;
	public static excelReader TestStepData;

	public static String keyword;
	public static String webElement;
	public static String TestDataField;
	public static String TestData;
	public static String ProceedOnFail;
	public static String TSID;
	public static String Description;
	public static File file ;
	public static FileInputStream Finputstream;
	
	public static void Initialize() throws IOException {
		
		TestStepData= new excelReader(System.getProperty("user.dir")+"//src//test//java//KeywordDriven//Selenium//Data//TestCasesData.xlsx");
		SuiteData 	 = new excelReader(System.getProperty("user.dir")+"//src//test//java//KeywordDriven//Selenium//Data//TestSuite&TestCases.xlsx");
		System.out.println(System.getProperty("user.dir"));
		
		file = new File(System.getProperty("user.dir")+"//src//test//java//KeywordDriven//Selenium//repository//login.properties");
		Finputstream = new FileInputStream(file);
		Repository.load(Finputstream);
		
		file = new File(System.getProperty("user.dir")+"//src//test//java//KeywordDriven//Selenium//repository//creatAnAccount.properties");
		Finputstream = new FileInputStream(file);
		Repository.load(Finputstream);
		
	}
	
	public static void main(String[] args) throws IOException {
		Initialize();	
	}
	
}
