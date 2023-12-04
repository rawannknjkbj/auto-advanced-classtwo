//last try(12/4/2023)
package AutoAdvanceClassTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases extends Parameters {
	@BeforeTest
	public void myBeforeTest() {
		driver.get(mainpage);
	}
	@Test(priority = 1)
	public void SignTestCase () throws InterruptedException {
		driver.get(SignUp);
		WebElement firstNameInput=driver.findElement(By.id("firstname"));
		WebElement lastNameInput=driver.findElement(By.id("lastname"));
		WebElement emailInput=driver.findElement(By.id("email_address"));
		WebElement passwordInput=driver.findElement(By.id("password"));
		WebElement confirmPasswordInput=driver.findElement(By.id("password-confirmation"));
		WebElement signUpButton=driver.findElement(By.xpath("//button[@title='Create an Account']"));
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		emailInput.sendKeys(Email);
		passwordInput.sendKeys(Password);
		confirmPasswordInput.sendKeys(Password);
		signUpButton.click();
		Thread.sleep(2000);
		String WelcomeMsg =driver.findElement(By.xpath("//div[@class='panel header']")).getText();
		softassert.assertEquals(WelcomeMsg.contains("Welcome"), true,"Validation the signup process");
		softassert.assertAll();
	}
	@Test(priority = 2)
	public void LogOutTest () throws InterruptedException {
		driver.get(Logoutt);
		Thread.sleep(7000);
        softassert.assertEquals(driver.getCurrentUrl(), mainpage,"validation of the website url after the logout");
        softassert.assertAll();
	}
	@Test(priority = 3)
	public void LogInTest () {
		driver.get(login);
		WebElement emailInput=driver.findElement(By.id("email"));
		WebElement passwordInput=driver.findElement(By.id("pass"));
		WebElement LogInButton=driver.findElement(By.id("send2"));
		emailInput.sendKeys(Email);
		passwordInput.sendKeys(Password);
		LogInButton.click();
		softassert.assertEquals(driver.getCurrentUrl(), "validation of the website url after the login");
        softassert.assertAll();
	}


////////////////////////////////////************///////////////////////////////////////////


	@AfterTest
	public void AfterTest() {}
}

////////////////////////////////////************///////////////////////////////////////////
