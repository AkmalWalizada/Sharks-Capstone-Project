package page.object;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class DesktopsPage extends Base {
	
	// in this class we will store all UI Elements that belong to desktops page of this application 
	
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
		
	}
	// @FindBy annotation is == driver findElement()
	@FindBy(xpath = "//a[text()= 'TEST ENVIRONMENT']")
	
	private WebElement logo;
	
	@FindBy(xpath = "//a[text()= 'Desktops']")
	
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()= 'Show All Desktops']")
	
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//h3[text()= 'Refine Search']")
	
	private WebElement text;
	
	@FindBy (xpath = "(//span[text()='Add to Cart'])[3]")
	
	private WebElement addToCartHPLP3065;
	
	@FindBy (id = "input-quantity")
	
	private WebElement inputQty;
	
	
	
	@FindBy(id = "button-cart")
	
	private WebElement cartButton;
	
	@FindBy (xpath = "//div[text()='Success: You have added ']")
	
	private WebElement successAdded;
	
	@FindBy (id = "button-cart")
	
	private WebElement canonCartButton;
	
	@FindBy (xpath = "//select[@id = 'input-option226']//child::option[@value='15']")
	
	private WebElement colorRed;
	
	@FindBy (xpath = "//input[@name='quantity']")
	
	private WebElement canonQty;
	
	@FindBy (id = "button-cart" )
	
	private WebElement canonAddCart;
	
	@FindBy (xpath = "//div[text()='Success: You have added ']")
	
	private WebElement canonSuccessMsg;
	
	
	
	
	
	
	
	
	
	
	
	public boolean isLogoDisplayed () {
		if (logo.isDisplayed())
			return true;
		else 
			return false;
	
		}
	
	public void clickOnDesktopTab() {
		desktops.click();
	
		
	}
	
	public void showAllDesktops() {
		showAllDesktops.click();
	}

	
	public boolean isTextDisplayed() {
		if(text.isDisplayed())
			return true;
		else 
			return false;
		
	}
	
	public void addToCartHPLP3065() {
		addToCartHPLP3065.click();
	}
	
	
	public void inputQty() {
		inputQty.click();
	}
	
	public void cartButton() {
		cartButton.click();
	}
	
	public boolean successAdded() {
		if(successAdded.isDisplayed())
			return true;
		else 
			return false;
			
		
	}
	
	public void canonCartButton() {
		canonCartButton.click();
	}
	
	public void colorRed() {
		colorRed.click();
	}
	
	public void canonQty() {
		canonQty.click();
	}
	
	public void canonAddCart() {
		canonAddCart.click();
	}
	
	public boolean canonSuccessMsg() {
		if(canonSuccessMsg.isDisplayed())
			return true;
		else
			return false;
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	


