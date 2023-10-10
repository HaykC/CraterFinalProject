package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class ItemsPage {
	
	public ItemsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//a[text()=' Items']")
	public WebElement Items;

	@FindBy (xpath = "//button[text()=' Add Item']")
	public WebElement AddItem;
	
	@FindBy (xpath = "//h3[text()='Items']")
	public WebElement ItemHeaderText;
	
	@FindBy (xpath = "//div[@class='relative rounded-md shadow-sm font-base']/input")
	public WebElement AddItem_NameBox;
	
	@FindBy (xpath = "//input[@id='0']")
	public WebElement AddItem_PriceBox;
	
	@FindBy (xpath = "//div[@tabindex='-1']/input")
	public WebElement AddItem_UnitDrop;
	
	@FindBy (xpath = "//span[text()='pc']")
	public WebElement AddItem_UnitDrop_pc_Option;
	
	@FindBy (name = "description")
	public WebElement AddItem_DescriptionBox;
	
	@FindBy (xpath = "//button[text()=' Save Item']")
	public WebElement AddItem_SaveItemBtn;
	
	@FindBy (xpath = "//button[text()='Filter ']")
	public WebElement AddItem_FilterBtn;
	
	@FindBy (xpath = "//input[@name='name']")
	public WebElement AddItem_Filter_Name_Box;
	
	@FindBy (xpath = "(//button[contains(@id, 'headlessui-menu-button')])[3]")
	public WebElement AddItem_Filter_3_Dots_Btn;
	
	@FindBy (xpath = "//a[text()=' Delete']")
	public WebElement AddItem_Filter_DeleteItem;
	
	@FindBy (xpath = "//a[text()=' Edit']")
	public WebElement AddItem_Filter_EditItem;
	
	@FindBy (xpath = "//h3[text()='Are you sure?']")
	public WebElement AddItem_Filter_Delete_AreYouSure_Text;
	
	@FindBy (xpath = "//button[text()='Ok']")
	public WebElement AddItem_Filter_Delete_Ok_Btn;
	
	@FindBy (xpath = "//button[text()='Cancel']")
	public WebElement AddItem_Filter_Delete_Cancel_Btn;
	
	@FindBy (xpath = "//h3[text()='New Item']")
	public WebElement AddItem_NewItem_Text;
	
	@FindBy (xpath = "//h3[text()='Edit Item']")
	public WebElement EditItem_Header_Text;
	
	@FindBy (xpath = "//button[text()=' Update Item']")
	public WebElement EditItem_UpdateItem_BTN;
	
	@FindBy (xpath = "//span[contains(text(), '00')]")
	public WebElement EditItem_UpdateItem_Price;
	
	
	
	
	
	
	
	
	
	
}