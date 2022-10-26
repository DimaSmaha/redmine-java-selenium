package pageObjects;

import org.openqa.selenium.By;

public class loginPageObjects extends homePageObjects{
    public String loginPageUrl = "https://www.redmine.org/login";
    public By usernameInput = By.id("username");
    public By passwordInput = By.id("password");

    public By submitBtn = By.name("login");

    public By loggedas = By.id("loggedas");
    public void fillLoginForm(String username, String password){
        fillElement(usernameInput,username);
        fillElement(passwordInput,password);;
    }
}
