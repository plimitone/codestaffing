package cdestaffing;

import org.openqa.selenium.By;

public class CDEObjectMap {
	
	//Rich Paths
	//Strings
	/*
	public static String BuildNumber = "Build_110_";
	public static String AppDirectory = "/Users/rsauther/Desktop/WebMDauto/AutomationBuilds/WebMD.app";
	public static String LogDirectory = "/Users/rsauther/Desktop/WebMDauto/Logs";
	public static String DataFileDirectory = "/Users/rsauther/Desktop/WebMDauto/Resources/";
	public static String FailureReportDirectory = "/Users/rsauther/Desktop/WebMDauto/Logs/FailureReport.txt";
	public static String EmailDirectory = "/Users/rsauther/Desktop/WebMDauto/Resources/Email.properties";
	*/
	
	//Phil Paths
	public static String BuildNumber = "Build_143_";
	public static String AppDirectory = "/Users/flimitone/Documents/workspace-bad/Auto/WebMD.app";
	public static String LogDirectory = "/Users/flimitone/Documents/workspace-bad/Logs";
	public static String DataFileDirectory = "/Users/flimitone/Documents/workspace-bad/Resources/";
	public static String FailureReportDirectory = "/Users/flimitone/Documents/workspace-bad/Logs/FailureReport.txt";
	public static String EmailDirectory = "/Users/flimitone/Documents/workspace-bad/Resources/Email.properties";
	
	
	//Home Screen
	public static final By HomeSymptomCheckerButton = By.name("UIA_tools_symptomchecker");//By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAStaticText[1]");
	public static final By HomeMedicationReminderButton = By.name("UIA_tools_medreminders");//By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAStaticText[1]");
	public static final By HomeRefillAndTransferButton = By.name("UIA_tools_walgreens");//By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[3]/UIAStaticText[1]");
	public static final By HomePillIdentifierButton = By.name("UIA_tools_pillid");//By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[4]/UIAStaticText[1]");
	public static final By HomeDrugsButton = By.name("UIA_tools_drugs");//By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[5]/UIAStaticText[1]");
	public static final By HomeConditionsButton = By.name("UIA_tools_conditions");//By.xpath("//UIAApplication[1]/UIAWindow[1]/UIACollectionView[1]/UIACollectionCell[6]/UIAStaticText[1]");

	
	// google accounts title
	public static final By GoogleAccountsTitle = By.id("qaEJec");
	
	// google sign in text
	public static final By GoogleSignInText = By.id("headingText");
	
	// google with your account text
	public static final By GoogleWithYourAccountText = By.id("headingText");
	
	// google email or phone field
	public static final By GoogleEmailOrPhone = By.id("identifierId");
	
	// google forgot email link
	// public static final By GoogleForgotEmail = By.linkText("Forgot email?");
	
	// google more options
	// public static final By GoogleMoreOptions = By.linkText("More options");
	
	// country link selector
	// public static final By GoogleCountrySelector = By.linkText("English (United States");
	
	// google help link
	public static final By GoogleHelpLink = By.linkText("Help");
	
	// google privacy link
	public static final By GooglePrivacyLink = By.linkText("Privacy");
	
	// google Terms link
	public static final By GoogleTermsLink = By.linkText("Terms");
}
