package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
	 @Test(dataProvider = "loginData")
	    public void LoginTest(String username, String password) throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        WebElement accountList = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));
	            accountList.click();

	        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-input-text")));
	            emailField.sendKeys(username);
	        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
	            continueButton.click();
    
	            
	        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	            passwordField.sendKeys(password);
	            driver.findElement(By.id("signInSubmit")).click();

	            
	            try {
	                WebElement accountName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList-nav-line-1")));
	                boolean isLoggedIn = accountName.isDisplayed();
	                Assert.assertTrue(isLoggedIn, "Login was not successful");
	            } catch (Exception e) {
	                Assert.fail("Login failed or the verification element was not found.");
	            }
	        }

	        @DataProvider(name = "loginData")
	        public Object[][] getLoginData() {
	            return new Object[][] {
	                { "9360775116", "mishika@24" },
	                { "3456789012", "anu@123" },
	                { "3245678912", "  "},
	                { "          ", "nivi@21"}
	            };
	        }
	    }
