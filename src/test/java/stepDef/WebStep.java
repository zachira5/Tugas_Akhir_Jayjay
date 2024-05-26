package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.WebPage;

public class WebStep {

    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }
    @Given("open web home page")
    public void openWebHomePage(){
        webPage.openBrowser();
    }

    @And("user click login popup")
    public void userClickLoginPopup() {
        webPage.clickLoginPopup();
    }
    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input password {string}")
    public void userInputPassword(String password) {
        webPage.inputPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webPage.clickButtonLogin();
    }

    @And("user click cancel login button")
    public void userClickCancelLoginButton() {
        webPage.clickCancelLoginButton();
    }

    @And("user click signup popup")
    public void userClickSignupPopup() {
        webPage.clickSignupPopup();
    }

    @And("user input username sign up {string}")
    public void userInputUsernameSignUp(String signupUsername) {
        webPage.inputUsernameSignup(signupUsername);
    }

    @And("user input password sign up {string}")
    public void userInputPasswordSignUp(String signupPassword) {
        webPage.inputPasswordSignup(signupPassword);
    }

    @And("user click signup button")
    public void userClickSignupButton() {
        webPage.clickSignupButton();
    }

    @When("user click product")
    public void userClickProduct() throws InterruptedException{
        webPage.clickProductList();
    }

    @And("user click add product")
    public void userClickAddProduct() {
        webPage.clickAddProduct();
    }

    @When("user click menu contact")
    public void userClickMenuContact() throws InterruptedException {
        webPage.clickMenuContact();
    }


    @And("user input contact email {string}")
    public void userInputContactEmail(String contactEmail) {
        webPage.inputContactEmail(contactEmail);
    }

    @And("user input contact name {string}")
    public void userInputContactName(String contactName) {
        webPage.inputContactName(contactName);
    }

    @And("user input message {string}")
    public void userInputMessage(String message) {
        webPage.inputMessage(message);
    }

    @And("user click button send message")
    public void userClickButtonSendMessage() {
        webPage.clickButtonSendMessage();
    }

    @When("user click logout button")
    public void userClickLogoutButton() throws InterruptedException{
        webPage.clickButtonLogout();
    }
}
