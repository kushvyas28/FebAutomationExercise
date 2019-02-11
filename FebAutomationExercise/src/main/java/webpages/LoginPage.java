package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This LoginPage class holds all web elements and events for Login screen.
 */

public class LoginPage {

	WebElement userNameField;
	WebElement passwordField;
	WebElement loginButton;

	public void papercutLogin(String username, String password, WebDriver driver) {
		
		// Finding input field for user name
		userNameField = driver.findElement(By.id("inputUsername"));
		
		// Finding input field for password
		passwordField = driver.findElement(By.id("inputPassword"));
		
		// Finding Login button
		loginButton = driver.findElement(By.name("$Submit$0"));

		// Enter user name
		if (userNameField.isDisplayed())
			userNameField.sendKeys(username);
		else
			System.out.println("UserNameField is not visible");
		
		// Enter password
		if (driver.findElement(By.id("inputPassword")).isDisplayed())
			passwordField.sendKeys(password);
		else
			System.out.println("PasswordField is not visible");
		
		// Click login button
		if (loginButton.isDisplayed())
			loginButton.click();
		else
			System.out.println("LoginButton is not visible");
	}
}
