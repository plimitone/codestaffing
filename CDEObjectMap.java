// This is an object map the would be used to store id's, xpaths, and other details for web elements. 

package cdestaffing;

import org.openqa.selenium.By;

public class CDEObjectMap {
	
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
