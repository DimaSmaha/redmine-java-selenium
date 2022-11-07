package pageObjects;

import org.openqa.selenium.By;

public class issuesPageObjects extends homePageObjects{
    public String issuesPageUrl = "https://www.redmine.org/projects/redmine/issues";
    public By addFilterDropdown = By.id("add_filter_select");
    public By authorIdChb = By.id("cb_author_id");
    public By issuesHeader = By.xpath("//h2");
}
