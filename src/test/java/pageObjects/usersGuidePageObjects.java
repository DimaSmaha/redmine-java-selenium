package pageObjects;

import org.openqa.selenium.By;

public class usersGuidePageObjects extends pageObjects.homePageObjects{

    public String userGuidePageUrl = "https://www.redmine.org/projects/redmine/wiki/Guide";
    public By frenchTranslation = By.cssSelector("[href=\"/projects/redmine/wiki/FrGuide\"]");

    public String frenchTranslationUrl = "https://www.redmine.org/projects/redmine/wiki/FrGuide";
    public By frenchText = By.xpath("//h2[1]");
}
