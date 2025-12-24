package pages;

import locators.LoginPageLocator;
import org.openqa.selenium.WebDriver;
import utils.WaitUtil;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUserName(String userName) {
        WaitUtil.waitForVisible(driver, LoginPageLocator.USERNAME_INPUT, 10).sendKeys(userName);
    }

    public void inputPass(String pass) {
        WaitUtil.waitForVisible(driver, LoginPageLocator.PASSWORD_INPUT, 10).sendKeys(pass);
    }

    public void clickLoginButton() {
        WaitUtil.waitForClickable(driver, LoginPageLocator.LOGIN_BUTTON, 10).click();
    }

    public boolean isloginSuccess() {
        return WaitUtil.waitForVisible(driver, LoginPageLocator.DASHBOARD_TITLE, 10).isDisplayed();
    }

    public boolean isLoginFailed() {
        return WaitUtil.waitForVisible(driver, LoginPageLocator.ERROR_MESSAGE, 10).isDisplayed();
    }

    public void logout() {
        WaitUtil.waitForClickable(driver, LoginPageLocator.USER_DROPDOWN, 10).click();
        WaitUtil.waitForClickable(driver, LoginPageLocator.LOGOUT_BUTTON, 10).click();
    }

    public boolean isLogoutSuccess() {
        return WaitUtil.waitForVisible(driver, LoginPageLocator.LOGIN_BUTTON, 10).isDisplayed();
    }
}
