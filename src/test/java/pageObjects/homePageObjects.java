package pageObjects;

import org.openqa.selenium.By;

public class homePageObjects extends commonPageObjects {

    public String redmineHomeLink = "https://www.redmine.org/";
    public By registerBtn = By.className("register");
    public By loginBtn = By.className("login");
    public By issuesBtn = By.className("issues");
    public By usersGuideBtn = By.cssSelector("h3~p>a[href=\"/projects/redmine/wiki/Guide\"]");
    public By redmineBook = By.xpath("//td[1]/a/img");
    public String redmineBookLink = "https://www.packtpub.com/product/mastering-redmine-second-edition/9781785881305";
}
