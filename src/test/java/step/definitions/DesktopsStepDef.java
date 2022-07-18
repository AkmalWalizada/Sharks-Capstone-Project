package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.object.DesktopsPage;

public class DesktopsStepDef extends Base {
	DesktopsPage desktopsPage = new DesktopsPage();

@Given("User is on Retail website")
public void user_is_on_retail_website() {
Assert.assertTrue(desktopsPage.isLogoDisplayed());   
  
}
@When("User click on Desktops tab")
public void user_click_on_desktops_tab() {
    // Write code here that turns the phrase above into concrete actions
  desktopsPage.clickOnDesktopTab();
  logger.info("User click on Desktops tab");
}
@When("User click on Show all desktops")
public void user_click_on_show_all_desktops() {
    // Write code here that turns the phrase above into concrete actions
   desktopsPage.showAllDesktops();
   logger.info("User click on Show all desktops");
}
@Then("User should see all items are present in Desktop page")
public void user_should_see_all_items_are_present_in_desktop_page() {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.isTextDisplayed();
	logger.info("User should see all items are present in Desktop page");
    
}

@When("User click ADD TO CART option on ‘HP LP3065’ item")
public void user_click_add_to_cart_option_on_hp_lp3065_item() {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.addToCartHPLP3065();
	logger.info("User click ADD TO CART option on ‘HP LP3065’ item");
   
}
@When("User select quantity {int}")
public void user_select_quantity(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.inputQty();
	logger.info("User select quantity {int}");
    
}
@When("User click add to Cart button")
public void user_click_add_to_cart_button() {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.cartButton();
	logger.info("User click add to Cart button");
   
}
@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart")
public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.successAdded();
	logger.info("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart");
	
   
}
@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.canonAddCart();
	logger.info("User click ADD TO CART option on ‘Canon EOS 5D’ item");
   
}
@When("User select color from dropdown ‘Red’")
public void user_select_color_from_dropdown_red() {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.colorRed();
	logger.info("User select color from dropdown ‘Red’");
   
}
@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart")
public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
    // Write code here that turns the phrase above into concrete actions
	desktopsPage.canonSuccessMsg();
	logger.info("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart");
   
}



}
