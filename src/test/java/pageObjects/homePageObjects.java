package pageObjects;

import org.openqa.selenium.By;

public class homePageObjects extends commonPageObjects {

    public By registerBtn = By.className("register");
    public By loginBtn = By.className("login");
    public By usersGuideBtn = By.cssSelector("h3~p>a[href=\"/projects/redmine/wiki/Guide\"]");
}
