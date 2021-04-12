package adPortal_StepDefinitions;

import adportalPageObjects.LogInPage;
import adportalPageObjects.ReachPage;
import adportalPageObjects.SignUpPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.AdPortalScreenShots;

public class AdPortal_NewCustomer_SSU_LogIn_StepDefinition {
	
	private SignUpPage signUpPage = new SignUpPage(DriverFactory.getDriver());
	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private ReachPage reachPage = new ReachPage(DriverFactory.getDriver());
	private AdPortalScreenShots adPortalScreenShots = new AdPortalScreenShots(DriverFactory.getDriver());


	
	@Given("New user is on AdPortal UAT sign up page")
	public void new_user_is_on_ad_portal_uat_sign_up_page() throws InterruptedException {
		logInPage.navigateTo_LogInPage();
		logInPage.click_SignUpLink_LogInPage();
		//signUpPage.navigateTo_SignUpPage();
	}
	@Given("user is on AdPortal UAT sign up page")
	public void user_is_on_ad_portal_uat_sign_up_page() throws InterruptedException {
		logInPage.navigateTo_LogInPage();
		Thread.sleep(6000);
		logInPage.click_SignUpLink_LogInPage_SSULogIn();
	}
	
	@When("User enters all required fields with new Email")
	public void user_enters_all_required_fields_with_new_email() {
		signUpPage.enter_Email("QATestEmail011@charter.com");
		signUpPage.enter_ConfirmEmail("QATestEmail011@charter.com");
		signUpPage.enter_Password("Spectrum123!");
		signUpPage.eneter_ConfirmPassword("Spectrum123!");	
	}

	@When("User enters all required fields with New Email for SSU")
	public void user_enters_all_required_fields_with_new_email_for_ssu() {
		signUpPage.enter_Email("QATestEmail012@charter.com");
		signUpPage.enter_ConfirmEmail("QATestEmail012@charter.com");
		signUpPage.enter_Password("Spectrum123!");
		signUpPage.eneter_ConfirmPassword("Spectrum123!");	
	}
	

	@When("User accepts license agreement and clicks next step and enters required fields")
	public void user_accepts_license_agreement_and_clicks_next_step_and_enters_required_fields() {
		signUpPage.click_CheckBox();
		signUpPage.click_nextStep();
		signUpPage.enter_FirstName("Media");
		signUpPage.enter_LastName("Solutions");
		signUpPage.enter_BusinessName("Spectrum Reach");
		signUpPage.enter_ZipCode("80111");
		signUpPage.enter_PhoneNumber("1234567890");
	}
	@When("User accepts license agreement and clicks next step and enters required fields for SSU")
	public void user_accepts_license_agreement_and_clicks_next_step_and_enters_required_fields_for_SSU() throws InterruptedException {
		signUpPage.click_CheckBox();
		signUpPage.click_nextStep();
		signUpPage.enter_FirstName("Media");
		signUpPage.enter_LastName("Solutions");
		signUpPage.enter_BusinessName("Spectrum Reach");
		signUpPage.enter_ZipCode("80111");
		signUpPage.enter_PhoneNumber("1234567890");
		Thread.sleep(5000);
	}

	@Then("User should be able to see Reach page to start the campaign")
	public void user_should_be_able_to_see_reach_page_to_start_the_campaign() {
		signUpPage.click_CreateAccountNewCustomer();
		reachPage.explicitly_Wait_For_ReachPageGetStartedButton();
		adPortalScreenShots.take_ScreenShot_ReachIntroPageNewCustomer("ReachPage_For_NewCustomer");
	}

	@Then("User should be able to create log in credentials for AdPortal UAT and land in reach page")
	public void user_should_be_able_to_create_log_in_credentials_for_ad_portal_uat_and_land_in_reach_page() {
		signUpPage.click_CreateAccountSSULogIn();
		reachPage.verify_Reach_Intro_Page_Title_For_NewUser();
		adPortalScreenShots.takeScreenShotSSU_SignUp("ReachPageView_FirstTimeUser");
	}


}
