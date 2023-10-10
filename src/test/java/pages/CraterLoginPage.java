package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterLoginPage {
	
	public CraterLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//div[text()='Email ']")
	public WebElement Crater_Title;
	
	@FindBy (xpath = "//div[text()='Email ']")
	public WebElement emailText;
	
	@FindBy (xpath = "//input[@name='email']")
	public WebElement emailBox;
	
	@FindBy (xpath = "//div[text()='Password ']")
	public WebElement passwordText;
	
	@FindBy (name = "password")
	public WebElement passwordBox;
	
	@FindBy (xpath = "//a[text()='Forgot Password?']")
	public WebElement forgotPassword;
	
	@FindBy (xpath = "//button[text()='Login']")
	public WebElement loginBtn;
	
	@FindBy (xpath = "//p[text()='Copyright @ Crater Invoice, Inc. 2023']")
	public WebElement copyRightText;
	
	@FindBy (xpath = "//h1[contains(text(), 'Simple')]")
	public WebElement craterInvoicingAppBigHeader;
	
	@FindBy (xpath = "//p[contains(text(), 'Crater helps')]")
	public WebElement craterInvoicingAppSmallHeader;
	
	@FindBy (xpath = "//span[text()='Field is required']")
	public List<WebElement> requiredFieldMessages;
	
	@FindBy (xpath = "//p[text()='These credentials do not match our records.']")
	public WebElement wrongCredentialsError;
	
}
