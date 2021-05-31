package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemUnitsPage extends BasePage {

    public SystemUnitsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='fltr-proizvoditel-dell']")
    private WebElement dellCheckbox;

    public void clickOnDellCheckbox() {
        dellCheckbox.click();
    }
}
