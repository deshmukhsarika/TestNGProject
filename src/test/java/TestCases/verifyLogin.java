package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObject;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class verifyLogin extends baseClass {
 
	@Test
	 public void login() throws IOException {

	  LoginPageObject obj = new LoginPageObject(driver);

	  obj.enterUsername().sendKeys(Constant.username);
	  
	 // CommonUtilities.handlExplictWait(10,obj.enterPssword());

	 
	  obj.enterPssword().sendKeys(Constant.password);
	  
	 // CommonUtilities.handlExplictWait(15,obj.clickOnLogin());
	  
	  
	  obj.clickOnLogin().click();
	  
	  obj.clickOnTryForFree().click();
	  
	  CommonUtilities.handleAssertions(Constant.expectedstring, obj.ActualerrorMsg().getText() );
	  
	}}  