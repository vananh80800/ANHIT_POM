package locators;

import org.openqa.selenium.By;

//Là nơi quản lý địa chỉ element
public class LoginPageLocator {
    public static final By USERNAME_INPUT =
            By.xpath("//input[@name='username']");

    public static final By PASSWORD_INPUT =
            By.xpath("//input[@name='password']");

    public static final By LOGIN_BUTTON =
            By.xpath("//button[@type='submit']");

    public static final By DASHBOARD_TITLE =
            By.xpath("//h6[text()='Dashboard']");

    public static final By ERROR_MESSAGE =
            By.xpath("//p[contains(normalize-space(.), 'Invalid credentials')]");

    public static final By USER_DROPDOWN =
            By.xpath("//p[@class='oxd-userdropdown-name']");

    public static final By LOGOUT_BUTTON =
            By.xpath("//a[text()='Logout']");
}
