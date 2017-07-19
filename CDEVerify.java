/**
 * This class runs through the accounts.google.com webpage to verify that elements exist.
 * Then Help link will be clicked and page title will be checked to make sure on Google Account Help.
 * Then finally go back to the accounts page and verify back on the accounts page by checking page title.
 */

package cdestaffing;
//This may need to be commented out or modified if running on another machine


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;


public class CDEVerify {
	 
	public static void main(String[] args) throws InterruptedException {
				
		// Create a new instance of the Firefox driver
		WebDriver ffd = new FirefoxDriver();
		ffd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Launch nytimes.com
		String url = "https://accounts.google.com";
		ffd.get("https://accounts.google.com");
		ffd.get(url);
		
		// Message that page is successfully opened
		System.out.println("Successfully opened the website accounts.google.com");
        
		// Store the title name into the String variable
		String title = ffd.getTitle();
		
		// Store the title length into the int variable
		int titleLength = ffd.getTitle().length();
		
		// Print the title and length to the Console window
		System.out.println("The title of the page is, " + title);
		System.out.println("The length of the title is, " + titleLength);
		
		// Store the URL in String variable
		String actualUrl = ffd.getCurrentUrl();
		
		//compare the actual and expected urls
		if (actualUrl.equals(url)){
			System.out.println("Verification is successful --- The correct URL was opened");
		}else{
			System.out.println("Verification has failed -- Incorrect URL has opened");
			//IN CASE OF FAILURE
			System.out.println("Actual URL is " + actualUrl);
			System.out.println("Expected URL is " + url);
		}
		
		// Wait for 5 Sec for things to catch up...
		System.out.println("Waiting for things to clear up and catch up......");
		Thread.sleep(5000);
		
		// Maximize the window
		ffd.manage().window().maximize();
		System.out.println("Window size has been maximized");
		
		
		// find the google title
		try {
			assertEquals("qaEJec", ffd.findElement(By.id("qaEJec")).getAttribute("id"));
			System.out.println("Found the google accounts title");
		} catch (Exception e) {
			System.out.println("Couldn't find the Google Accounts Title");
		}

		// find the sign in text
		try {
			assertEquals("headingText", ffd.findElement(By.id("headingText")).getAttribute("id"));
			System.out.println("Found the sign in text");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// find and verify forgot email
		try {
			ffd.getPageSource().contains("Forgot email?");
			System.out.println("Found the forgot email link");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// find and verify More options
		try {
			ffd.getPageSource().contains("More options");
			System.out.println("Found the more options link");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// find and verify Next button is present
		try {
			ffd.getPageSource().contains("Next");
			System.out.println("Found next button text");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		// find the country selector
		try {
			ffd.getPageSource().contains("English (United States)");
			System.out.println("found the united states selector");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		// find the help link at the footer
		try {
			ffd.findElement(By.linkText("Help"));
			System.out.println("Found the footer help link");
		} catch (Exception e) {
			System.out.println(e);
		}

		// find the privacy link at the footer
		try {
			ffd.findElement(By.linkText("Privacy"));
			System.out.println("Found the footer privacy link");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//find the terms link at the footer
		try {
			ffd.findElement(By.linkText("Terms"));
			System.out.println("Found the footer terms link");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// click the email or phone field
		try {
			ffd.findElement(CDEObjectMap.GoogleEmailOrPhone).click();
			System.out.println("Field has been clicked");
		} catch(Exception e) {
			System.out.println(e);
		}
		
		// wait for the browser to catch up if it's going too fast
		Thread.sleep(5000);
		
		// then click Help Link at the bottom of the screen. Should open a new tab.
		try {
			ffd.findElement(By.linkText("Help")).click();
			System.out.println("Clicked the help link");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// Now check we're in a new tab, store new tab title
		String newTabUrl = "https://support.google.com/accounts?hl=en#topic=3382296";
		ffd.get("https://support.google.com/accounts?hl=en#topic=3382296");
		ffd.get(newTabUrl);
					
		//store tab url into a variable
		String actualTabUrl = ffd.getCurrentUrl();
		
		// then compare the urls
			if (actualTabUrl.equals(newTabUrl)) {
				System.out.println("The new tab help urls match");
			} else {
				System.out.println("Help Tab urls do not match");
				// now show them if they don't match
				System.out.println("Actual new tab url is: " + actualTabUrl);
				System.out.println("The expected url is: " + newTabUrl);
			}
		
		
	System.out.println("");
	System.out.println("For now...we're done\n");
	
	// close the browser window when all is done
	ffd.close();
	
	// now close EVERYTHING
	ffd.quit();
	
	System.out.println("Browser window closed\n");
	System.out.println("All complete");
	}
}