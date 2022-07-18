package page.object;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;


public class RetailPage extends Base {
	
	
	
	
	public RetailPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	
	@FindBy (id = "input-email")
	private WebElement emailInput;
	
	@FindBy (id = "input-password")
	private WebElement passwordinput;
	
	@FindBy (xpath = "//input[@value='Login']")
	
	private WebElement loginButton;
	
	@FindBy (xpath = "//h2[text()='My Account']")
	
	private WebElement myAccountText;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliat;
	
	@FindBy(id = "input-company")
	private WebElement companyInput;
	
	@FindBy(id = "input-website")
	private WebElement webSiteInput;
	
	@FindBy(id = "input-tax")
	private WebElement taxInput;
	
	@FindBy(xpath = "(//div[@class='radio']/label/input)[1]")
	private WebElement paymentMethodChequ;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutAs;
	
	@FindBy(id = "input-cheque")
	private WebElement payeeNameInput;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMsg;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffilaitInformation;
	
	@FindBy(xpath = "(//div[@class='radio']/label/input)[3]")
	private WebElement paymentMethodBankTransfer;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankName;
	
	@FindBy(id = "input-bank-branch-number")
	private WebElement abaBranchName;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccount;
	
	@FindBy(id = "input-firstname")
	private WebElement firstName;
	
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	
	@FindBy(id = "input-email")
	private WebElement email;
	
	@FindBy(id = "input-telephone")
	private WebElement telephone;
	
	
	
	
	
	public void clickOnmyAccount() {
		myAccount.click();
	}
	
	
    public void clickOnLogin() {
		login.click();
	}
	
	
	
	public void enterEmail (String emailvalue) {
		emailInput.sendKeys(emailvalue);
	}
	
	public void enterpassword(String passwordvalue) {
		passwordinput.sendKeys(passwordvalue);
		
	}
	
	public void clickOnloginButton() {
		loginButton.click();
	}
	
	public boolean myAccountTextIsPresent() {
		
		if(myAccountText.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	
	public void registerForAffiliat() {
		registerForAffiliat.click();
	}
	
	
	public void enterCompanyName(String companyNameValue ) {
		companyInput.sendKeys(companyNameValue);
		
	}
	
	public void webSiteInput(String webSiteInputValue) {
		webSiteInput.sendKeys(webSiteInputValue);
	}
	
	public void taxInput(String taxInputValue) {
		taxInput.sendKeys(taxInputValue);
	}
	
	public void paymentMethod(String paymentType) {
		if(paymentType.equalsIgnoreCase("cheque"))
			paymentMethodChequ.click();
		
	}
	
	public void aboutAs() {
		aboutAs.click();
		
	}
	
	public void payeeNameInput(String payeeNameInputValue) {
		payeeNameInput.sendKeys(payeeNameInputValue);
	}
	
	public void continueButton() {
		continueButton.click();
	}
	
	public boolean successMsg() {
		if(successMsg.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	public void paymentMethodBank(String paymentType) {
		if(paymentType.equalsIgnoreCase("bankTransfer"))
			paymentMethodBankTransfer.click();
		
	}
	
	public void enterBankName(String bankNameValue) {
		
		bankName.sendKeys(bankNameValue);
	}
	
	public void enterABABranch(String abaBranchNameValue) {
		abaBranchName.sendKeys(abaBranchNameValue);
	}
	
	public void enterSwiftCode(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}
	
	public void enterAccountName(String accountNameValue) {
		accountName.sendKeys(accountNameValue);
	}
	
	public void enterAccountNumber(String accountNumberValue) {
		accountNumber.sendKeys(accountNumberValue);
	}
	
	public void editAffiliatInformatio() {
		editAffilaitInformation.click();
	}
	
	public void clickEditAccount() {
		editAccount.click();
	}
	
	public void enterFirstName(String firstNameValue) {
		firstName.sendKeys(firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		lastName.sendKeys(lastNameValue);
	}
	
	public void emailAddress(String emailValue) {
		email.sendKeys(emailValue);
	}
	
	public void telephone(String telephoneValue) {
		telephone.sendKeys(telephoneValue);
	}
	
	public String actualSucessMessage() {
		return successMsg.getText(); 
	}
	
	
	
	
	
	
	

}
