package page.object;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class LaptopPage extends Base {
	
	public LaptopPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[2]/a")
	private WebElement Laptop;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptops;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBook;
	
	@FindBy(id = "button-cart")
	private WebElement AddCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMsg;
	
	@FindBy(xpath = "//h2[text()='$602.00']")
	private WebElement AmountOfMoney;
	
	@FindBy(id = "cart-total")
	private WebElement ClickOnCartItem;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement ClickOnXButton;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement EmptyMsg;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement CompareMacBook;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement CompareMacAir;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement CompareMsg;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement ClickOnCopareLink;
	
	@FindBy(id = "content")
	private WebElement CompareText;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement ClickOnWishList;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement ClickOnCreatAccountMsg;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement ClickOnMacBookProItem;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement PriceTag;
	
	
	
	
	
	public void ClickOnLaptop() {
		Laptop.click();
	}
	
	public void ClickOnShowAllLaptops() {
		showAllLaptops.click();
	}
	
	
	public void ClickOnMacBook () {
		MacBook.click();
	}
	
	public void ClickAddCartButton() {
		AddCartButton.click();
	}
	
	public boolean IsSuccessMsgDispayed() {
		if( SuccessMsg.isDisplayed())
			return true;
		else 
			return false;

	}
	
	public boolean IsAmountOfMoneyDisplayed() {
		if(AmountOfMoney.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void ClickOnCartItem () {
		ClickOnCartItem.click();
	}
	
	public void ClickOnXButton() {
		ClickOnXButton.click();
	}
	
	public boolean IsEmptyMsgDisplayed() {
		if(EmptyMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void ClickOnCompareMacBook() {
		CompareMacBook.click();
	}
	
	public void ClickOnCompareMacAir() {
		CompareMacAir.click();
	}
	
	public boolean IsCompareMsgDisplayed() {
		if(CompareMsg.isDisplayed())
			return true;
		else
			return false;
			
	}
	
	public void ClickOnCopareLink() {
		ClickOnCopareLink.click();
	}
	
	public boolean IsCompareTextDisplayed() {
		if(CompareText.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void ClickOnWishList() {
		ClickOnWishList.click();
	}
	
	public void ClickOnCreatAccountMsg() {
		ClickOnCreatAccountMsg.click();
	}
	
	public void ClickOnMacBookProItem() {
		ClickOnMacBookProItem.click();
		
	}
	
	public boolean PriceTag() {
		if(PriceTag.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
