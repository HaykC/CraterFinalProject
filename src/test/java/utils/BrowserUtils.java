package utils;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	WebDriverWait wait;
	Actions action;

	public void waitForElementToBeVisible(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForAllElementsToBeVisible(List<WebElement> element) {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public void sendKeysWithActionClass(WebElement element, String input) {
		action = new Actions(Driver.getDriver());
		action.sendKeys(element, input).build().perform();
	}

	// this method generate 3 digit random number
	public int randomNumber() {
		Random rand = new Random();
		int randomNum = rand.nextInt((999 - 100) + 1) + 100;
		return randomNum;
	}

	public void clickWithActionsClass(WebElement element) {
		action = new Actions(Driver.getDriver());
		action.click(element).build().perform();
	}

	public void MoveToElement(WebElement element) {
		action = new Actions(Driver.getDriver());
		action.moveToElement(element).build().perform();
	}
}
