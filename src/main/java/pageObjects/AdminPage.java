package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver ldriver; //ldriver = local driver
	public AdminPage(WebDriver rdriver) { //rdriver = remote driver
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this); //This is use to initialize our web element 
	}
	//Java Project how we locate 
	//WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
	
	//Maven Project how we locate 
	@FindBy (xpath = "//*[@id=\"modal-login\"]/div/form/div[1]/input")
	WebElement txtEmail;
	
	@FindBy (xpath = "//*[@id=\"modal-login\"]/div/form/div[2]/input")
	WebElement txtPassword;
	
	@FindBy (xpath = "//*[@id=\"modal-login\"]/div/form/div[4]/button")
	WebElement btnLogin;
	
	//User define Method to perform operation on above web element 
	
	public void setEmail(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickOnLogin () {
		btnLogin.click();
	}

	

}
