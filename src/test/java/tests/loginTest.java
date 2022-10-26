package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class loginTest extends pageObjects.loginPageObjects {
    String username = "babalen";
    String password = "qwerty";

    @BeforeEach
    public void openBrowser(){
        start();
    }

    @AfterEach
    public void closeBrowser(){
        finish();
    }

    @Test
    public void firstLoginTest(){
        openWebsite();
        clickElement(loginBtn);
        checkUrl(loginPageUrl);
        fillLoginForm(username,password);
        clickElement(submitBtn);
        isElementVisible(loggedas);
    }
}
