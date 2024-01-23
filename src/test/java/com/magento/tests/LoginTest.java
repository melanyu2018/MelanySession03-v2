package com.magento.tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void doLogin(){

        String expected_message="Account Information";

        // go to register page
        homePage.goToSignInLink();

        //fill the form
        loginPage.fillOutFormLogin();

        //submit information
        loginPage.submitData();

/*
        //espera por un elemento que contenga el xpath y texto account information
        WebElement msg = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div[1]/strong")));

        //assertion
        Assert.assertEquals(msg.getText(), expected_message);

 */

    }
}
