package tests;

//Chỉ viết testcase, ko chứa element, không chứa hàm thao tác với element
//Muốn bảo trì locator thì qua locator bảo trì
//Muốn bảo trì hàm thao tác với element thì qua page bảo trì
// => code sạch, đẹp, bảo trì dễ vì đã phân chia hợp lý

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccess(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName("Admin");
        loginPage.inputPass("admin123");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isloginSuccess(), "Login thất bại");
        System.out.println("Login thành công");
    }

    @Test
    public void loginFail(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName("Admin");
        loginPage.inputPass("admin1234");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLoginFailed(), "Không hiển thị message lỗi");
        System.out.println("Login fail đúng mong đợi");
    }

    @Test
    public void loginAndLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName("Admin");
        loginPage.inputPass("admin123");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isloginSuccess(), "Login thất bại");
        System.out.println("Login thành công");
        loginPage.logout();
        Assert.assertTrue(loginPage.isLogoutSuccess(), "Logout thất bại");
        System.out.println("Logout thành công");
    }

}
