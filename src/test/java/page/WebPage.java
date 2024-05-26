package page;

import org.openqa.selenium.By;

import static helper.Utility.driver;
import static org.junit.Assert.assertTrue;

public class WebPage {
    By btn_login_popup = By.id("login2");
    By input_username = By.id("loginusername");
    By input_password = By.id("loginpassword");
    By btn_login = By.xpath("//button[normalize-space()='Log in']");
    By btn_cancel_login = By.xpath("//div[@id='logInModal']//button[@type='button'][normalize-space()='Close']");
    By btn_sign_popup = By.id("signin2");
    By username_signup = By.id("sign-username");
    By password_signup = By.id("sign-password");
    By btn_signup = By.xpath("//button[normalize-space()='Sign up']");

    By click_product = By.xpath("//a[text()='Nokia lumia 1520']");
    By add_product = By.xpath("//a[normalize-space()='Add to cart']");

    By btn_contact = By.xpath("//a[normalize-space()='Contact']");
    By contactEmailInput = By.id("recipient-email");
    By contactNameInput = By.id("recipient-name");
    By messageContact = By.id("message-text");
    By btn_send_message = By.xpath("//button[normalize-space()='Send message']");

    By btn_logout = By.xpath("//a[@id='logout2']");


    public void openBrowser(){
        driver.get("https://www.demoblaze.com/");
    }

    public void clickLoginPopup(){
        driver.findElement(btn_login_popup).click();
    }

    public void inputUsername(String username){
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(input_password).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(btn_login).click();
    }
    public void clickCancelLoginButton(){
        driver.findElement(btn_cancel_login).click();
    }

    public void clickSignupPopup(){
        driver.findElement(btn_sign_popup).click();
    }

    public void inputUsernameSignup(String signupUsername){
        driver.findElement(username_signup).sendKeys(signupUsername);
    }

    public void inputPasswordSignup(String signupPassword){
        driver.findElement(password_signup).sendKeys(signupPassword);
    }
    public void clickSignupButton(){
        driver.findElement(btn_signup).click();
    }
    public void clickProductList() throws InterruptedException{
        Thread.sleep(15000);
        driver.findElement(click_product).click();
    }
    public void clickAddProduct(){
        driver.findElement(add_product).click();
    }
    public void clickMenuContact() throws InterruptedException{
        Thread.sleep(15000);
        driver.findElement(btn_contact).click();
    }
    public void inputContactEmail(String contactEmail){
        driver.findElement(contactEmailInput).sendKeys(contactEmail);
    }
    public void inputContactName(String contactName){
        driver.findElement(contactNameInput).sendKeys(contactName);
    }
    public void inputMessage(String message){
        driver.findElement(messageContact).sendKeys(message);
    }
    public void clickButtonSendMessage(){
        driver.findElement(btn_send_message).click();
    }
    public void clickButtonLogout()throws InterruptedException{
        Thread.sleep(15000);
        driver.findElement(btn_logout).click();
    }
}
