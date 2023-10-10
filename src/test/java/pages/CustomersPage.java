package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CustomersPage {
	public CustomersPage() {
		PageFactory.initElements(Driver.getDriver(), this);
}
	
	
	@FindBy (xpath = "//h3[text()='Customers']")
	public WebElement Customers_CustomersHeaderText;
	
	@FindBy (xpath = "//button[text()=' New Customer']")
	public WebElement Customers_NewCustomer_BTN;
	
	@FindBy (xpath = "//h3[text()='New Customer']")
	public WebElement Customers_NewCustomer_Header;
	
	@FindBy (xpath = "//h6[text()='Basic Info']")
	public WebElement Customers_BasicInfo_Header;
	
	@FindBy (xpath = "(//div[@class='relative w-full text-left'][1]//input)[1]")
	public WebElement Customers_BasicInfo_DisplayName_Box;
	
	@FindBy (xpath = "(//div[@class='relative w-full text-left'][2]//input)[1]")
	public WebElement Customers_BasicInfo_PrimaryContact_Box;
	
	@FindBy (xpath = "//input[@name='email']")
	public WebElement Customers_BasicInfo_Email_Box;
	
	@FindBy (xpath = "//div[@class='relative w-full text-left'][5]//input")
	public WebElement Customers_BasicInfo_PrimaryCurrency;
	
	@FindBy (xpath = "//div[@class='relative w-full text-left'][6]//input")
	public WebElement Customers_BasicInfo_Website;
	
	@FindBy (xpath = "//input[@type='text'])[7]")
	public WebElement Customers_BasicInfo_Prefix;
	
	@FindBy (xpath = "//table")
	public WebElement Customers_Table;
	
	@FindBy (xpath = "//button[text()=' Save Customer']")
	public WebElement Customers_SaveCustomer_BTN;
	
	@FindBy (xpath = "//th[text()='Name ']")
	public WebElement Customers_Table_Name;
	
	@FindBy (xpath = "(//input[@name='phone'])[1]")
	public WebElement Customers_Table_Phone;
	
	@FindBy (xpath = "//th[text()='Amount Due ']")
	public WebElement Customers_Table_Amount_Due;
	
	@FindBy (xpath = "//th[text()='Added On ']")
	public WebElement Customers_Table_Added_On;
	
	@FindBy (id = "headlessui-menu-button-5")
	public WebElement Customers_Table_More_Options;
	
	@FindBy (xpath = "//a[text()=' Edit']")
	public WebElement Customers_Table_More_Edit;
	
	@FindBy (xpath = "//a[text()=' View']")
	public WebElement Customers_Table_More_View;
	
	@FindBy (xpath = "//a[text()=' Delete']")
	public WebElement Customers_Table_More_Delete;
	
	@FindBy (xpath = "//p[text()='Success!']")
	public WebElement Customers_Created_Success_Header;
	
	@FindBy (xpath = "//button[text()='Filter ']")
	public WebElement Customers_Table_FIlter_BTN;
	
	@FindBy (xpath = "//input[@name='name']")
	public WebElement Customers_Table_FIlter_DisplayName;
	
	@FindBy (xpath = "(//button[contains(@id, 'headlessui-menu-button')])[3]")
	public WebElement Customers_Table_3Dots_Options_BTN;
	
	@FindBy (xpath = "//button[text()='Ok']")
	public WebElement Customers_Table_Delete_OK_BTN;
	
	@FindBy (xpath = "//span[text()='Field is required']")
	public WebElement Customers_NewCustomer_FieldIsRequired_error_message;
	
	@FindBy (xpath = "(//input[@name='address_name'])[1]")
	public WebElement Customers_NewCustomer_BillingAddress_Name_Box;
	
	@FindBy (xpath = "(//input[@name='billing.state'])[1]")
	public WebElement Customers_NewCustomer_BillingAddress_State_Box;
	
	@FindBy (xpath = "(//div[@tabindex='-1']/input)[2]")
	public WebElement Customers_NewCustomer_BillingAddress_SelectCountry_Drop;
	
	@FindBy (xpath = "(//span[text()='Armenia'])[1]")
	public WebElement Customers_NewCustomer_BillingAddress_SelectCountry_Armenia;
	
	@FindBy (xpath = "//input[@name='billing.city']")
	public WebElement Customers_NewCustomer_BillingAddress_City_Box;
	
	@FindBy (xpath = "(//input[@name='phone'])[2]")
	public WebElement Customers_NewCustomer_BillingAddress_Phone_Box;
	
	@FindBy (xpath = "(//input[@name='zip'])[1]")
	public WebElement Customers_NewCustomer_BillingAddress_ZipCode_Box;
	
	@FindBy (xpath = "//textarea[@name='billing_street1']")
	public WebElement Customers_NewCustomer_BillingAddress_Street1_Box;
	
	@FindBy (xpath = "//textarea[@name='billing_street2']")
	public WebElement Customers_NewCustomer_BillingAddress_Street2_Box;
	
	@FindBy (xpath = "(//input[@name='address_name'])[2]")
	public WebElement Customers_NewCustomer_ShippingAddress_Name_Box;
	
	@FindBy (xpath = "//input[@name='shipping.state']")
	public WebElement Customers_NewCustomer_ShippingAddress_State_Box;
	
	@FindBy (xpath = "//input[@name='shipping.city']")
	public WebElement Customers_NewCustomer_ShippingAddress_City_Box;
	
	@FindBy (xpath = "(//input[@name='phone'])[3]")
	public WebElement Customers_NewCustomer_ShippingAddress_Phone_Box;
	
	@FindBy (xpath = "(//input[@name='zip'])[2]")
	public WebElement Customers_NewCustomer_ShippingAddress_ZipCode_Box;
	
	@FindBy (xpath = "(//div[@tabindex='-1']/input)[3]")
	public WebElement Customers_NewCustomer_ShippingAddress_SelectCountry_Drop;
	
	@FindBy (xpath = "(//span[text()='Armenia'])[2]")
	public WebElement Customers_NewCustomer_ShippingAddress_SelectCountry_Armenia;
	
	@FindBy (xpath = "//button[text()=' Copy from Billing']")
	public WebElement Customers_NewCustomer_BillingAddress_Copy_BTN;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}