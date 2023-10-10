package tests;

import java.time.Duration;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CraterLoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;


public class LoginPageUI_Components {
	CraterLoginPage login = new CraterLoginPage();
	BrowserUtils utils = new BrowserUtils();
	
	

	@Given("I navigate to the Crater Login Page")
	public void i_navigate_to_the_crater_login_page() {
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Driver.getDriver().manage().window().maximize();
		
	    Driver.getDriver().get(TestDataReader.getProperty("appUrl"));
	}
	@Then("I should be directed to the Crater Login Page")
	public void i_should_be_directed_to_the_crater_login_page() {
		Assert.assertNotNull(Driver.getDriver().getCurrentUrl());
	}
	@Then("I should verify The Page title is {string}")
	public void i_should_verify_the_page_title_is(String title) {
	   Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
	}
	@Then("I should verify a Text-Box with the Label {string}")
	public void i_should_verify_a_text_box_with_the_label(String email) {
	    Assert.assertTrue(login.emailText.isDisplayed());
	    Assert.assertTrue(login.emailText.getText().contains(email));
	}
	@Then("I should verify A Text box with the Label {string}")
	public void i_should_verify_a_text_box_with_the_text(String password) {
		Assert.assertTrue(login.passwordText.isDisplayed());
	    Assert.assertTrue(login.passwordText.getText().contains(password));
	}
	@Then("I should see A link titled {string}")
	public void i_should_see_a_link_titled(String forgotPassword) {
		Assert.assertTrue(login.forgotPassword.isDisplayed());
	    Assert.assertTrue(login.forgotPassword.getText().equals(forgotPassword));
	}
	@Then("I should see a button labeled {string}")
	public void i_should_see_a_button_labeled(String loginBtn) {
		Assert.assertTrue(login.loginBtn.isDisplayed());
	    Assert.assertTrue(login.loginBtn.getText().equals(loginBtn));
	}
	@Then("The footer text should be following: {string}")
	public void the_footer_text_should_be_following(String copyright) {
		Assert.assertTrue(login.copyRightText.isDisplayed());
	    Assert.assertTrue(login.copyRightText.getText().equals(copyright));
	}
	@Then("I should see A heading located to the right with the following text {string}")
	public void i_should_see_a_heading_located_to_the_right_with_the_following_text(String bigHeader) {
		Assert.assertTrue(login.craterInvoicingAppBigHeader.isDisplayed());
	    Assert.assertTrue(login.craterInvoicingAppBigHeader.getText().equals(bigHeader));
	}
	@Then("I should see A Heading located underneath Heading {int} with the following text {string}")
	public void i_should_see_a_heading_located_underneath_heading_with_the_following_text(Integer int1, String smallHeader) {
		Assert.assertTrue(login.craterInvoicingAppSmallHeader.isDisplayed());
	    Assert.assertTrue(login.craterInvoicingAppSmallHeader.getText().equals(smallHeader));
	}
	
}
