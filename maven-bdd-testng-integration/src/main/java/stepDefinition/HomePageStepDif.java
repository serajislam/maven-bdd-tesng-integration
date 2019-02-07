package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import utility.InvokeBrowser;

public class HomePageStepDif {
	
	public WebDriver driver;
	
	public HomePageStepDif()
	{
		this.driver= InvokeBrowser.getDriver();
	}
	
	

	@Given("^users should be already in the home page$")
	public void users_should_be_already_in_the_home_page() 
	
	{
		
		driver.get("https://phptravels.com/");
		System.out.println(driver.getTitle());
	}

	@Then("^users click on Demo page$")
	public void users_click_on_Demo_page() 
	{
		driver.findElement(By.xpath("//a[@class='text-primary']")).click();
		System.out.println("Demo page title is "+driver.getTitle());
	}

	@Then("^users click on Pricing page$")
	public void users_click_on_Pricing_page()
	{
		driver.findElement(By.xpath("//a[@class='text-success']")).click();
		System.out.println("Pricing page title is "+driver.getTitle());
	}

	@Then("^users mouse over Features page$")
	public void users_mouse_over_Features_page() 
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Features')]"))).build().perform();
	}

	@Then("^users click on Hotels Module page$")
	public void users_click_on_Hotels_Module_page() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Hotels Module')]")).click();
		System.out.println("Hotels Module page title is "+driver.getTitle());
	}

	@Then("^user close the browser$")
	public void user_close_the_browser()
	{
		driver.quit();
		
	}
	
}
