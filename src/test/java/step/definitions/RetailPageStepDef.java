package step.definitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.object.RetailPage;

public class RetailPageStepDef extends Base {

	RetailPage retailPage = new RetailPage();

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnmyAccount();
		logger.info("User click on MyAccount");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPage.clickOnLogin();
		logger.info("User click on Login");

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		retailPage.enterEmail(email);
		logger.info("user enter + email");
		retailPage.enterpassword(password);
		logger.info("user enter + password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPage.clickOnloginButton();
		logger.info("User click on login button");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailPage.myAccountTextIsPresent();
		logger.info("User should be logged in to MyAccount dashboard");

	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailPage.registerForAffiliat();
		logger.info("User click on Register for an Affiliate Account link");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> affiliateinformation = dataTable.asMaps(String.class, String.class);
		retailPage.enterCompanyName(affiliateinformation.get(0).get("company"));
		retailPage.webSiteInput(affiliateinformation.get(0).get("website"));
		retailPage.taxInput(affiliateinformation.get(0).get("taxID"));
		retailPage.paymentMethod(affiliateinformation.get(0).get("paymentMethod"));
		retailPage.payeeNameInput(affiliateinformation.get(0).get("payeeName"));
		logger.info("User fill affiliate form with below information");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPage.aboutAs();
		logger.info("User check on About us check box");

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPage.continueButton();
		logger.info("User click on Continue button");

	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		Assert.assertTrue(retailPage.successMsg());
		logger.info("User should see a success message");

	}

	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		retailPage.editAffiliatInformatio();
		logger.info("User click on Edit your affiliate informationlink");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPage.paymentMethodBank("bankTransfer");
		logger.info("user click on Bank Transfer radio button");

	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> bankinformation = dataTable.asMaps(String.class, String.class);
		retailPage.enterBankName(bankinformation.get(0).get("bankName"));
		retailPage.enterABABranch(bankinformation.get(0).get("abaNumber"));
		retailPage.enterSwiftCode(bankinformation.get(0).get("swiftCode"));
		retailPage.enterAccountName(bankinformation.get(0).get("accountName"));
		retailPage.enterAccountNumber(bankinformation.get(0).get("accountNumber"));
		logger.info("User fill Bank information with below information");
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailPage.clickEditAccount();
		logger.info("User click on Edit your account information link");

	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> personalinformation = dataTable.asMaps(String.class, String.class);
		retailPage.enterFirstName(personalinformation.get(0).get("firstName"));
		retailPage.enterLastName(personalinformation.get(0).get("lastName"));
		retailPage.emailAddress(personalinformation.get(0).get("email"));
		retailPage.telephone(personalinformation.get(0).get("telephone"));
		logger.info("User modify below information");

	}

	@Then("User should see a message Success: Your account has been successfully updated.")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		Assert.assertTrue(retailPage.successMsg());
		logger.info("User should see a message Success");

	}

}
