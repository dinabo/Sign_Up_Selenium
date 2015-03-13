package core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_Up_Selenium {
	public static void main(String[] args) {

		// WebDriver driver = new HtmlUnitDriver();
		WebDriver driver = new FirefoxDriver();
		String text_case_id_01 = "TC-001.01";
		String text_case_id_02 = "TC-001.02";
		String text_case_id_03 = "TC-001.03";
		String text_case_id_04 = "TC-001.04";
		String text_case_id_05 = "TC-001.05";
		String text_case_id_06 = "TC-001.06";
		String text_case_id_07 = "TC-001.07";
		String text_case_id_08 = "TC-001.08";
		String text_case_id_09 = "TC-001.09";
		String text_case_id_10 = "TC-001.10";
		String text_case_id_11 = "TC-001.11";
		String text_case_id_12 = "TC-001.12";
		String text_case_id_13 = "TC-001.13";
		String text_case_id_14 = "TC-001.14";
		String text_case_id_15 = "TC-001.15";
		String text_case_id_16 = "TC-001.16";
		String text_case_id_17 = "TC-001.17";
		String text_case_id_18 = "TC-001.18";
		String text_case_id_19 = "TC-001.19";
		String text_case_id_20 = "TC-001.20";
		String text_case_id_21 = "TC-001.21";
		
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		
		String title_sign_up_expected = "Welcome to Sign Up v1";
		String app_title_sign_up_expected = "Sign Up";
		
		String title_facebook_expected = "Welcome to Facebook - Log In, Sign Up or Learn More";
		String title_twitter_expected = "Welcome to Twitter - Login or Sign up";
		String title_flickr_expected = "Welcome to Flickr - Photo Sharing";
		String title_youtube_expected = "YouTube";
		
		String copyright_expected = "© 2015 learn2test.net";
		String os_browser_expected = "Windows 7 & Firefox 34";
		
		String error_fname_empty_expected = "Please enter First Name";
		String error_lname_empty_expected = "Please enter Last Name"; 
		String error_email_empty_expected = "Please enter Email Address";
		String error_phone_empty_expected = "Please enter Phone Number";
		
		String fname = "Alex";
		String lname = "Moore";
		String email = "alexmoore@gmail.com";
		String phone = "415 555-1212";
		String gender = "Female";
		String state = "California";
		String terms = "Agreed";

		// TC-001.01

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - PASSED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01
					+ " - FAILED");
			System.out.println("Title Expected/Actual: \t"
					+ title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-001.02

		driver.findElement(By.id("id_f_title")).getText();
		String app_title_sign_up_actual = driver.findElement(
				By.id("id_f_title")).getText();

		if (app_title_sign_up_expected.equals(app_title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - PASSED");
			System.out.println("Title Application Expected/Actual: \t"
					+ app_title_sign_up_expected + "/"
					+ app_title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_02
					+ " - FAILED");
			System.out.println("Title Application Expected/Actual: \t"
					+ app_title_sign_up_expected + "/"
					+ app_title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-001.03

		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - PASSED");
			System.out.println("Title facebook Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_03
					+ " - FAILED");
			System.out.println("Title facebook Expected/Actual: \t"
					+ title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		}

		// TC-001.04

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
					+ " - PASSED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_04
					+ " - FAILED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		}

		// TC-001.05

		driver.findElement(By.id("id_img_twitter")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabst = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabst.get(1));
		String title_twitter_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabst.get(0));

		if (title_twitter_expected.equals(title_twitter_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
					+ " - PASSED");
			System.out.println("Title twitter Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_05
					+ " - FAILED");
			System.out.println("Title twitter Expected/Actual: \t"
					+ title_twitter_expected + "/" + title_twitter_actual);
			System.out.println("=======================================");
		}

		// TC-001.06

		driver.findElement(By.id("id_img_flickr")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabsf = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabsf.get(1));
		String title_flickr_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabsf.get(0));

		if (title_flickr_expected.equals(title_flickr_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - PASSED");
			System.out.println("Titleflickr Expected/Actual: \t"
					+ title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_06
					+ " - FAILED");
			System.out.println("Title flickr Expected/Actual: \t"
					+ title_flickr_expected + "/" + title_flickr_actual);
			System.out.println("=======================================");
		}

		// TC-001.07

		driver.findElement(By.id("id_img_youtube")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabsy = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(allTabsy.get(1));
		String title_youtube_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabsy.get(0));

		if (title_youtube_expected.equals(title_youtube_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - PASSED");
			System.out.println("Title youtube Expected/Actual: \t"
					+ title_youtube_expected + "/" + title_youtube_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_07
					+ " - FAILED");
			System.out.println("Title youtube Expected/Actual: \t"
					+ title_youtube_expected + "/" + title_youtube_actual);
			System.out.println("=======================================");
		}

		// TC-001.08: error-handling

		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_actual = driver
				.findElement(By.id("ErrorLine")).getText();

		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - PASSED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_08
					+ " - FAILED");
			System.out.println("Error Expected/Actual: \t"
					+ error_fname_empty_expected + "/"
					+ error_fname_empty_actual);
			System.out.println("=======================================");
		}

		// TC-001.09

		DateFormat dtFormat = new SimpleDateFormat("MMMMM dd, YYYY ");
		Calendar cal = Calendar.getInstance();
		String current_timestamp = dtFormat.format(cal.getTime());
		String current_timestamp_app = driver.findElement(By.id("timestamp"))
				.getText();
		if (current_timestamp_app.equalsIgnoreCase(current_timestamp)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - PASSED");
			System.out.println("Current timestamp/ current timestamp app:"
					+ current_timestamp + "/" + current_timestamp_app);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_09
					+ " - FAILED");
			System.out.println("Current timestamp/ current timestamp app:"
					+ current_timestamp + "/" + current_timestamp_app + "|");
			System.out.println("=======================================");
		}

		// TC-001.10

		driver.findElement(By.id("copyright")).getText();
		String copyright_actual = driver.findElement(By.id("copyright"))
				.getText();

		if (copyright_expected.equals(copyright_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_10
					+ " - PASSED");
			System.out.println("Copyright Expected/Actual: \t"
					+ copyright_expected + "/" + copyright_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_10
					+ " - FAILED");
			System.out.println("Copyright Expected/Actual: \t"
					+ copyright_expected + "/" + copyright_actual);
			System.out.println("=======================================");
		}

		// TC-001.11

		driver.findElement(By.id("os_browser")).getText();
		String os_browser_actual = driver.findElement(By.id("os_browser"))
				.getText();

		if (os_browser_expected.equals(os_browser_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - PASSED");
			System.out.println("OS & Browser Expected/Actual: \t"
					+ os_browser_expected + "/" + os_browser_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_11
					+ " - FAILED");
			System.out.println("OS & Browser Expected/Actual: \t"
					+ os_browser_expected + "/" + os_browser_actual);
			System.out.println("=======================================");
		}

		// TC-001.12

		if (driver.findElement(By.id("id_state")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + text_case_id_12
					+ " - PASSED");
			System.out.println("State dropdown list exists \t");

			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_12
					+ " - FAILED");
			System.out.println("State dropdown list doesn't exist \t");

			System.out.println("=======================================");
		}

		// TC-001.13

		if (driver.findElement(By.id("id_checkbox")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + text_case_id_13
					+ " - PASSED");
			System.out.println("Checkbox for agreement exists \t");

			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_13
					+ " - FAILED");
			System.out.println("Checkbox for agreement doesn't exist \t");

			System.out.println("=======================================");
		}

		// TC-001.14

		if (driver.findElement(By.id("id_g_radio_01")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + text_case_id_14
					+ " - PASSED");
			System.out
					.println("Male radio-button in the Gender field exists \t");

			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_14
					+ " - FAILED");
			System.out
					.println("Male radio-button in the Gender field doesn't exist \t");

			System.out.println("=======================================");
		}

		// TC-001.15

		if (driver.findElement(By.id("id_g_radio_02")).isDisplayed()) {

			System.out.println("Test Case ID: \t\t" + text_case_id_15
					+ " - PASSED");
			System.out
					.println("Female radio-button in the Gender field exists \t");

			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_15
					+ " - FAILED");
			System.out
					.println("Female radio-button in the Gender field doesn't exist \t");

			System.out.println("=======================================");
		}

		// TC-001.16

		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_g_radio_02")).click();
		// driver.findElement(By.id("id_state")).sendKeys(Keys.DOWN);
		Select sele = new Select(driver.findElement(By.id("id_state")));
		sele.selectByIndex(5);
		driver.findElement(By.id("id_checkbox")).click();
		driver.findElement(By.id("id_submit_button")).click();

		String fname_conf_actual = driver.findElement(By.id("id_fname_conf"))
				.getText();
		String lname_conf_actual = driver.findElement(By.id("id_lname_conf"))
				.getText();
		String email_conf_actual = driver.findElement(By.id("id_email_conf"))
				.getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf"))
				.getText();
		String gender_conf_actual = driver.findElement(By.id("id_gender_conf"))
				.getText();
		String state_conf_actual = driver.findElement(By.id("id_state_conf"))
				.getText();
		String terms_conf_actual = driver.findElement(By.id("id_terms_conf"))
				.getText();

		if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
				&& email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)
				&& gender.equals(gender_conf_actual)
				&& state.equals(state_conf_actual)
				&& terms.equals(terms_conf_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_16
					+ " - PASSED");
			System.out.println("First Name Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Name Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("Gender Expected/Actual: \t" + gender + "/"
					+ gender_conf_actual);
			System.out.println("State Expected/Actual: \t" + state + "/"
					+ state_conf_actual);
			System.out.println("Terms Expected/Actual: \t" + terms + "/"
					+ terms_conf_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_16
					+ " - FAILED");
			System.out.println("First Name Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Name Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("Gender Expected/Actual: \t" + gender + "/"
					+ gender_conf_actual);
			System.out.println("State Expected/Actual: \t" + state + "/"
					+ state_conf_actual);
			System.out.println("Terms Expected/Actual: \t" + terms + "/"
					+ terms_conf_actual);
			System.out.println("=======================================");
		}
		driver.findElement(By.id("id_back_button")).click();

		// TC-001.17

		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();

		if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual)
				&& email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_17
					+ " - PASSED");
			System.out.println("First Name Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Name Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_17
					+ " - FAILED");
			System.out.println("First Name Expected/Actual: \t" + fname + "/"
					+ fname_conf_actual);
			System.out.println("Last Name Expected/Actual: \t" + lname + "/"
					+ lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/"
					+ email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/"
					+ phone_conf_actual);
			System.out.println("=======================================");
		}

		driver.findElement(By.id("id_back_button")).click();
		
		// TC-001.18: error-handling
		
				driver.findElement(By.id("id_fname")).sendKeys(fname);
				driver.findElement(By.id("id_submit_button")).click();
				String error_lname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

				if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_18
							+ " - PASSED");
					System.out.println("Error Last Name is empty Expected/Actual: \t"
							+ error_lname_empty_expected + "/"
							+ error_lname_empty_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_18
							+ " - FAILED");
					System.out.println("Error Last Name is not empty Expected/Actual: \t"
							+ error_lname_empty_expected + "/"
							+ error_lname_empty_actual);
					System.out.println("=======================================");
				}
		
				driver.findElement(By.id("id_reset_button")).click();
				
				// TC-001.19: error-handling
				
				driver.findElement(By.id("id_fname")).sendKeys(fname);
				driver.findElement(By.id("id_lname")).sendKeys(lname);
				driver.findElement(By.id("id_submit_button")).click();
				String error_email_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

				if (error_email_empty_expected.equals(error_email_empty_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_19
							+ " - PASSED");
					System.out.println("Error Email Address is empty Expected/Actual: \t"
							+ error_email_empty_expected + "/"
							+ error_email_empty_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_19
							+ " - FAILED");
					System.out.println("Error Email Address is not empty Expected/Actual: \t"
							+ error_email_empty_expected + "/"
							+ error_email_empty_actual);
					System.out.println("=======================================");
				}
				
				driver.findElement(By.id("id_reset_button")).click();
				
				// TC-001.20: error-handling
				
				driver.findElement(By.id("id_fname")).sendKeys(fname);
				driver.findElement(By.id("id_lname")).sendKeys(lname);
				driver.findElement(By.id("id_email")).sendKeys(email);
				
				driver.findElement(By.id("id_submit_button")).click();
				
				String error_phone_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

				if (error_phone_empty_expected.equals(error_phone_empty_actual)) {
					System.out.println("Test Case ID: \t\t" + text_case_id_20
							+ " - PASSED");
					System.out.println("Error Phone is empty Expected/Actual: \t"
							+ error_phone_empty_expected + "/"
							+ error_phone_empty_actual);
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_20
							+ " - FAILED");
					System.out.println("Error Phone is not empty Expected/Actual: \t"
							+ error_phone_empty_expected + "/"
							+ error_phone_empty_actual);
					System.out.println("=======================================");
				}
				
				driver.findElement(By.id("id_reset_button")).click();
				
				// TC-001.21

				driver.findElement(By.id("id_fname")).sendKeys(fname);
				driver.findElement(By.id("id_lname")).sendKeys(lname);
				driver.findElement(By.id("id_email")).sendKeys(email);
				driver.findElement(By.id("id_phone")).sendKeys(phone);
				driver.findElement(By.id("id_g_radio_02")).click();
				driver.findElement(By.id("id_state")).sendKeys(Keys.DOWN);
				driver.findElement(By.id("id_checkbox")).click();
				
				driver.findElement(By.id("id_reset_button")).click();

				if (driver.findElement(By.id("id_fname")).getText().isEmpty() 
						&& driver.findElement(By.id("id_lname")).getText().isEmpty()
						&& driver.findElement(By.id("id_email")).getText().isEmpty()
						&& driver.findElement(By.id("id_phone")).getText().isEmpty()
						&& !driver.findElement(By.id("id_g_radio_02")).isSelected()
						&& driver.findElement(By.id("id_state")).isDisplayed()
						&& !driver.findElement(By.id("id_checkbox")).isSelected()) 
					{
					System.out.println("Test Case ID: \t\t" + text_case_id_21
							+ " - PASSED");
					System.out.println("First Name is reseted \t");
					System.out.println("Last Name is reseted \t");
					System.out.println("Email is reseted \t");
					System.out.println("Phone Number is reseted \t");
					System.out.println("Gender is reseted \t");
					System.out.println("State is reseted \t");
					System.out.println("Terms agreement is reseted \t");
					System.out.println("=======================================");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id_21
							+ " - FAILED");
					System.out.println("First Name is not reseted \t");
					System.out.println("Last Name is not reseted \t");
					System.out.println("Email is not reseted \t");
					System.out.println("Phone Number is not reseted \t");
					System.out.println("Gender is not reseted \t");
					System.out.println("State is not reseted \t");
					System.out.println("Terms agreement is not reseted \t");
					System.out.println("=======================================");
				}
				
					
				
		driver.quit();
	}
}
