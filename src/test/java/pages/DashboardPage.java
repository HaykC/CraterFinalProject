package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class DashboardPage {
	public DashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
		
	
	
	@FindBy(xpath = "//span[text()='Amount Due']")
	public WebElement AmountDue;

	@FindBy(xpath = "//span[text()='Customers']")
	public WebElement Customers;

	@FindBy(xpath = "//span[text()='Invoices']")
	public WebElement Invoices;

	@FindBy(xpath = "//span[text()='Estimates']")
	public WebElement Estimates;

	@FindBy(xpath = "//div[text()='This year']")
	public WebElement ThisYearDrop;
	
	@FindBy (xpath = "//p[text()='Logged in successfully.']")
	public WebElement loggedInSuccessMessage;
	
	@FindBy (xpath = "//h6[contains(text(), 'Sales &')]")
	public WebElement Dashboard_SalesAndExpenses_Header;
	
	@FindBy (xpath = "//h6[text()='Due Invoices']")
	public WebElement Dashboard_DueInvoices_Header;
	
	@FindBy (xpath = "//h6[text()='Recent Estimates']")
	public WebElement Dashboard_RecentEstimates_Header;
	
	@FindBy (id = "graph")
	public WebElement Dashboard_Table;
	
	@FindBy (xpath = "//div[@tabindex='0']")
	public WebElement Dashboard_DropDown;
	
	@FindBy (xpath = "//span[text()='This year']")
	public WebElement Dashboard_DropDownYear_This_Year;
	
	@FindBy (xpath = "//span[text()='Previous year']")
	public WebElement Dashboard_DropDownYear_Previous_Year;

	
	

}
