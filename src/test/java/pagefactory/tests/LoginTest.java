package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest{

    private static final String LOGIN_FOR_ENTERING = "test@gmail.com";
    private static final String PASSWORD_FOR_ENTERING = "test1234";
    private static final long TIME_TO_WAIT = 30;
    private static final String EXPECTED_ERROR_MESSAGE = "Неверные данные авторизации.";

    @Test
    public void checkThatErrorMessageAppearsAfterLoginWithNotRegisteredAccount() {
        getHomePage().clickOnLoginIcon();
        getLoginPage().enterLoginInLoginField(LOGIN_FOR_ENTERING);
        getLoginPage().enterPasswordInPasswordField(PASSWORD_FOR_ENTERING);
        getLoginPage().clickOnSubmitLoginButton();
        getLoginPage().waitForVisibilityOfElement(TIME_TO_WAIT, getLoginPage().getErrorMessagePopup());
        assertEquals(getLoginPage().getErrorMessage().getText(), EXPECTED_ERROR_MESSAGE);
    }
}
