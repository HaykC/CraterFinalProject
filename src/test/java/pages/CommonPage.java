package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CommonPage {
	public CommonPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath = "//a[text()=' Dashboard']")
	public WebElement CommonPage_Dashboard;
	
	@FindBy (xpath = "//a[text()=' Customers']")
	public WebElement CommonPage_Customers;
	
	@FindBy (xpath = "//a[text()=' Items']")
	public WebElement CommonPage_Items;
	
	@FindBy (xpath = "//a[text()=' Estimates']")
	public WebElement CommonPage_Estimates;
	
	@FindBy (xpath = "//a[text()=' Invoices']")
	public WebElement CommonPage_Invoices;
	
	@FindBy (xpath = "//a[text()=' Recurring Invoices']")
	public WebElement CommonPage_RecurringInvoices;
	
	@FindBy (xpath = "//a[text()=' Payments']")
	public WebElement CommonPage_Payments;
	
	@FindBy (xpath = "//a[text()=' Expenses']")
	public WebElement CommonPage_Expenses;
	
	@FindBy (xpath = "//a[text()=' Reports']")
	public WebElement CommonPage_Reports;
	
	@FindBy (xpath = "//a[text()=' Settings']")
	public WebElement CommonPage_Settings;
	
	
}
