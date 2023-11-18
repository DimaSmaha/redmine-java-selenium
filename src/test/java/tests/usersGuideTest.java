package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class usersGuideTest extends pageObjects.usersGuidePageObjects{
    String username = "babalen";
    String password = "qwerty";

    @BeforeEach
    public void openBrowser() throws MalformedURLException {
        start();
    }

    @AfterEach
    public void closeBrowser(){
        finish();
    }

    @Test
    public void usersGuideTest(){
        openWebsite();
        clickElement(usersGuideBtn);
        checkUrl(userGuidePageUrl);
        clickElement(frenchTranslation);
        checkUrl(frenchTranslationUrl);
        checkElementText(frenchText,"Guide d'installation");
    }
}
