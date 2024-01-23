package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Identificar los WebElementes
    By linkSignIn= By.linkText("Sign In");

    By email=By.id("email");
    By pass=By.id("pass");

    By buttonRegister = By.id("send2");


    // Constructor
    public LoginPage(WebDriver driver){// el drver sera pasado desde el Base test , en el metodo setUp
        this.driver=driver;
    }

    //Metodos o funciones

    public void  goToSignInLink(){
        driver.findElement(linkSignIn).click();
    }
    public void fillOutFormLogin(){
        driver.findElement(email).sendKeys("perod343@gmail.com");
        driver.findElement(pass).sendKeys("2]H9N%S9q[Dk");
    }

    public void submitData(){
        driver.findElement(buttonRegister).submit();
    }

}
