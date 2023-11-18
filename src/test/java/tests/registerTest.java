package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class registerTest extends pageObjects.registerPageObjects{
String username = getRandomString();
String password = "qwerty";
String name = "Dan";
String surname = "Dam";
String email = getRandomString()+"@gmail.com";

    @BeforeEach
    public void openBrowser() throws MalformedURLException {
        start();
    }

    @AfterEach
    public void closeBrowser(){
        finish();
    }

    @Test
    public void firstRegisterTest(){
        openWebsite();
        clickElement(registerBtn);
        checkUrl(registerPageUrl);
        fillRegisterForm(username,password,name,surname,email);
        clickElement(confirmBtn);
        isElementVisible(successRegisterNotification);
    }
}
