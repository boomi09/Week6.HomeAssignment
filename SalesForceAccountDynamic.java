package StepDefinitionHA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceAccountDynamic extends ProjectSpecificMethod {
	
	@Given("Enter the account name as (.*)$")
	public void enterAccountName(String accountname) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountname);
	}
    @When("Click on Ownership drop down and select as Public")
	public void clickOwnership() {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement owner=driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		js.executeScript("arguments[0].scrollIntoView(true);", owner);
		owner.click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();
	}
    @When("Click on the Save button")
	public void clickSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
    @Then("Verify Account Created")
	public void verifyAccount() {
		WebElement verifyAccount= driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		System.out.println("Account Name Is:"+ verifyAccount.getText());
	}

}
