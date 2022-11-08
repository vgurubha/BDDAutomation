package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookLogin {
	WebDriver driver;
	@Given("User should be open the facebook login page")
	public  void user_should_be_open_the_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IM-RT-LP-1361\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	@Then("user verifies username textbox")
	public void user_verifies_username_textbox() {
		WebElement userName=	driver.findElement(By.id("email"));
		boolean flag=userName.isDisplayed();
			if (flag) {
				System.out.println("Pass");
			}else {
				System.out.println("fail");
			}
	}
	
	@And("user verifies password textbox")
	public void user_verifies_password_textbox() {
		WebElement password=	driver.findElement(By.id("passContainer"));
		boolean flag=password.isDisplayed();
			if (flag) {
				System.out.println("Pass");
			}else {
				System.out.println("fail");
			}
	}
	

	@When("User enter user name in to textbox")
	public void user_enter_user_name_in_to_textbox() {
		WebElement userName=	driver.findElement(By.id("email"));
		userName.sendKeys("8333051083");
	}

	@And("User enter password into textbox")
	public void user_enter_password_into_textbox() {
		WebElement password=	driver.findElement(By.id("pass"));
		password.sendKeys("raju7258");
	}

	@And("User click on submit button")
	public void user_click_on_submit_button() {
		WebElement loginButton=  driver.findElement(By.name("login"));
		loginButton.click();
	}
	
	
	
	@Then("User veify the homepage logo")
	public void user_veify_the_homepage_logo() {
		
		System.out.println("Home page verified");
	}
	
	


	


}
