package StepDefinitionHA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceAccountCreation {
	ChromeDriver driver;
	
	@Given("Set the Environment")
	public void setEnvironment() {
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	@Given("Enter the Username")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
	}
	@Given("Enter the Password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
	}
	@When("Click on the login button")
	public void login() {
		driver.findElement(By.id("Login")).click();
	}
    @When("Click on the toggle menu")
	public void clickToggleMenu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
    @When("Click on the View All link")
	public void viewAllClick() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
    @When("Click on the App Launcher")
	public void clickAppLauncher() {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement applauncher=driver.findElement(By.xpath("//p[text()='App Launcher']"));
		js.executeScript("arguments[0].scrollIntoView(true);", applauncher);
		applauncher.click();
	}
    @When("Click on the Sales option")
	public void clickOnSales() {
		driver.findElement(By.xpath("//a[text()='Sales']")).click();
	}
    @When("Click on the Accounts Tab")
	public void clickAccountsTab() {
		driver.findElement(By.xpath("//span[text()='Accounts']")).click();
	}
    @When("Click on the New button")
	public void clickNewButton() {
		driver.findElement(By.xpath("//a[@title='New']")).click();
	}
    @Given("Enter the account name")
	public void enterAccountName() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Boomiraja");
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
