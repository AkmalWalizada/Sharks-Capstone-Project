package step.definitions;

import core.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.DesktopsPage;
import page.object.LaptopPage;

public class LaptopSteoDef extends Base {

	DesktopsPage desktopsPage = new DesktopsPage();

	LaptopPage laptopPage = new LaptopPage();
	


	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopPage.ClickOnLaptop();
		logger.info("User click on Laptop &NoteBook tab");

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopPage.ClickOnShowAllLaptops();
		logger.info("User click on Show all Laptop &NoteBook option");

	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopPage.ClickOnMacBook();
		logger.info("User click on MacBook item");

	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopPage.IsSuccessMsgDispayed();
		logger.info("User should see a message ‘Success: You have added MacBook to your shopping cart!’");

	}

	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		laptopPage.IsAmountOfMoneyDisplayed();
		logger.info("User should see ‘{int} tem\\\\(s){double}’ showed to the cart");

	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopPage.ClickOnCartItem();
		logger.info("User click on cart option");

	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopPage.ClickOnXButton();
		logger.info("user click on red X button to remove the item from cart");

	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopPage.IsEmptyMsgDisplayed();
		logger.info("item should be removed and cart should show ‘{int} item\\\\(s)’");

	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopPage.ClickOnCompareMacBook();
		logger.info("User click on product comparison icon on ‘MacBook’");

	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopPage.ClickOnCompareMacAir();
		logger.info("User click on product comparison icon on ‘MacBook Air");

	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
         laptopPage.IsCompareMsgDisplayed();
         logger.info("User should see a message ‘Success: You have added MacBook Air to your product comparison!’");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopPage.ClickOnCopareLink();
		logger.info("User click on Product comparison link");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopPage.IsCompareTextDisplayed();
		logger.info("User should see Product Comparison Chart");

	}

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopPage.ClickOnWishList();
		logger.info("User click on heart icon to add ‘Sony VaIO’ laptop to wish list");

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
        laptopPage.ClickOnCreatAccountMsg();
        logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’");
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopPage.ClickOnMacBookProItem();
		logger.info("User click on ‘MacBook Pro’ item");

	}

	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptopPage.PriceTag();
		logger.info("User should see ‘${double}’ price tag is present on UI.");

	}

}
