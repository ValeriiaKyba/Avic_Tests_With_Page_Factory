package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.id;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class, 'sign-holder')]//input[@name='login']")
    private WebElement loginField;

    @FindBy(xpath = "//div[contains(@class, 'sign-holder')]//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[contains(@class, 'sign-holder')]//button[contains(@class, 'submit')]")
    private WebElement submitLoginButton;

    @FindBy(xpath = "//div[contains(@class, 'js_message')]")
    private WebElement errorMessage;

    private static final String ERROR_MESSAGE_POPUP = "modalAlert";

    public void enterLoginInLoginField(String login) {
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void enterPasswordInPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnSubmitLoginButton() {
        submitLoginButton.click();
    }

    public By getErrorMessagePopup() {
        return id(ERROR_MESSAGE_POPUP);
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }
}
