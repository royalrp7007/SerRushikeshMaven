package stepdefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminPage;

public class AdminStepDefination extends Base {
	
	
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
        driver = new ChromeDriver();
        
        admin = new AdminPage(driver); //Create object af AdminPage java class 
	}

	@When("User open url {string}")
	public void user_open_url(String url) {
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.findElement(By.id("mdiv")).click();
	   driver.findElement(By.xpath("//li[contains(text(),'account')]")).click();
	   }

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
	    admin.setEmail(email);
	    admin.setPassword(password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws InterruptedException {
	   admin.clickOnLogin();
	   Thread.sleep(2000);
	}	

	@Then("Verify account user name display as {string}")
	public void verify_account_user_name_display_as(String string) {
	 String ActualName =  driver.findElement(By.xpath("//a[contains(text(),'Rushikesh')]")).getText();
	 if(string.equals(ActualName)) {
		 System.out.println("Login Successfully in corect account");
	 }
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}
	

}
