package com.magento.utils;

import com.magento.pages.LoginPage;
import com.magento.pages.RegisterPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;
    protected RegisterPage registerPage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        driver= new FirefoxDriver();//instanciando el objeto driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variable.TIME_OUT));
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(1200,740));
        driver.get(Variable.BASE_URL);

        //pasando la instackia de driver creada en la linea 19 al POM
        registerPage=new RegisterPage(driver) ;
        loginPage=new LoginPage(driver);

    }

    @AfterMethod
    public void teardown(){
        if (driver!=null){
            //driver.quit();
        }

    }

}
