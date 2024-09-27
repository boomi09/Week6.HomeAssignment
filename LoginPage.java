package StepDefinitionHA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	@Given("Set the Environment")
	public void setEnvironment() {
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	@Given("Enter the Username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the Password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
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
}
