package CRM;

public class LoginPage_Locators {
    // Xpath for URL
    static String url = "https://crm.anhtester.com/admin/authentication";

    // Xpath for Header Login Page
    static String headerLoginPage = "//h1[normalize-space()='Login']";
    // Xpath in Login form
    static String inputEmail = "//input[@type='email']";
    static String inputPassword = "//input[@type='password']";
    static String buttonLogin = "//button[@type='submit']";
    static String checkboxRememberMe = "//input[@id='remember']";
    static String linkForgotPassword = "//a[contains(@href,'forgot_password') or normalize-space() ='Forgot Password?']";

    // Xpath for errorMessage
    static String alertErrorMessage = "//div[contains(@class,'alert-danger')]";
    static String alertErrorEmailRequired = "//div[contains(text(),'The Email Address field')]";
    static String alertErrorPasswordRequired = "//div[contains(text(),'The Password field')]";
}
