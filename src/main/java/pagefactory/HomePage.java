package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='category-items--left']//a[text()='iPhone 12 Pro Max']")
    private WebElement iphone12ProMaxButton;

    public void clickOnIphone12ProMaxButton() {
        iphone12ProMaxButton.click();
    }
}
