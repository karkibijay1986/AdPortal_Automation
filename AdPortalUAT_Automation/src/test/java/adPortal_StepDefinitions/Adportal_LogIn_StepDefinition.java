package adPortal_StepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import adportalPageObjects.LogInPage;
import adportalPageObjects.ReachPage;
import adportalPageObjects.RequestDashBoardPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.AdPortalScreenShots;


public class Adportal_LogIn_StepDefinition {

	private LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
	private RequestDashBoardPage requestDashBoardPage = new RequestDashBoardPage(DriverFactory.getDriver());
	private ReachPage reachPage = new ReachPage(DriverFactory.getDriver());
	private AdPortalScreenShots adPortalScreenShots = new AdPortalScreenShots(DriverFactory.getDriver());
	private JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();

	
	@Given("User is on AdPortalUAT SignUp Page and clicks Login link")
	public void user_is_on_ad_portal_uat_sign_up_page_and_clicks_login_link() {
		// DriverFactory.getDriver().get("https://adportal.uat.stage.frequence.rocks/202003-sign-up-b");
		logInPage.navigateTo_LogInPage();
		//signUpPage.navigateTo_SignUpPage();
		//JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
		//js.executeScript("window.scrollBy(0,100)");
		//signUpPage.click_Login();
	}

	@Given("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		logInPage.enter_LogInEmail("c-bijay.karki@charter.com");
		logInPage.enter_LogInPassword("Spectrum123!");
	}

	@When("User clicks log in")
	public void user_clicks_log_in() {
		logInPage.clickLogIn();
	}

	@Then("User lands on request dashboard page")
	public void user_lands_on_request_dashboard_page() {
		requestDashBoardPage.request_DashBoardPage_With_Drafts_verification();

	}

	@Then("User starts or continues with campaign")
	public void user_starts_or_continues_with_campaign() {
		requestDashBoardPage.get_Started_Campaign();
	}

	@Then("USer should land on intro step of the reach page")
	public void u_ser_should_land_on_intro_step_of_the_reach_page() {
		reachPage.verify_Reach_Intro_Page_Title();
	}

	@Then("User clicks on next button")
	public void user_clicks_on_next_button() {
		reachPage.explicitly_Wait_For_ReachPageNextButton();
		reachPage.click_ReachPageNextButton();
	}

	@Then("User should be taken to the Reach {int} of {int} page")
	public void user_should_be_taken_to_the_reach_of_page(Integer int1, Integer int2) {
		reachPage.get_Text_From_ReachPage1();
		adPortalScreenShots.take_ScreenShot_ReachIntroPage("Reach_1_of_3_Page_");
	}

	@Then("User should land on reach page with help center button at the footer of the page")
	public void user_should_land_on_reach_page_with_help_center_button_at_the_footer_of_the_page() {
		js.executeScript("window.scrollBy(0,150)");
		reachPage.waitForHelpCenterLinkToBeClickable();
		adPortalScreenShots.takeScreenShotHelpCenter_FAQ("HelpCenter_Button_");
	}

	@Then("user clicks on help center button it should open the help center page with FAQs")
	public void user_clicks_on_help_center_button_it_should_open_the_help_center_page_with_fa_qs() {
		reachPage.click_ReachPageHelpCenterLink();
	}

	@Then("user click FAQs it should open relevant Q\\/As")
	public void user_click_fa_qs_it_should_open_relevant_q_as() {
		reachPage.click_FAQS_And_TakeScreenShots();
	}

}
