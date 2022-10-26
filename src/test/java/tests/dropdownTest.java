package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class dropdownTest extends pageObjects.issuesPageObjects{
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
    public void dropdownTest(){
        openWebsite();
        clickElement(issuesBtn);
        checkUrl(issuesPageUrl);
        selectDropdownValue(addFilterDropdown,"author_id");
        isElementVisible(authorIdChb);
    }
}
