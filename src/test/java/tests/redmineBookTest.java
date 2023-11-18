package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class redmineBookTest extends pageObjects.issuesPageObjects{
    @BeforeEach
    public void openBrowser() throws MalformedURLException {
        start();
    }

    @AfterEach
    public void closeBrowser(){
        finish();
    }

    @Test
    public void redmineBookTest(){
        openWebsite();
        clickElement(redmineBook);
        checkUrl(redmineBookLink);
        goBrowserBack();
        checkUrl(redmineHomeLink);
        clickElement(issuesBtn);
        checkUrl(issuesPageUrl);
        checkElementText(issuesHeader,"Питання");
    }
}
