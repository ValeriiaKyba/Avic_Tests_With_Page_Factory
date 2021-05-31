package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='category-items--left']//a[text()='iPhone 12 Pro Max']")
    private WebElement iphone12ProMaxButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'elektronika')]")
    private WebElement computersButtonOnSidebar;

    @FindBy(xpath = "//a[@class='sidebar-item' and contains(@href, 'gotovyie-pk')]")
    private WebElement systemUnitsButtonOnSidebar;

    @FindBy(xpath = "//div[contains(@class, 'header-bottom__right')]//a[contains(@href, 'sign-in')]")
    private WebElement loginIcon;

    public void clickOnIphone12ProMaxButton() {
        iphone12ProMaxButton.click();
    }

    public void hoverOnComputersOnSidebar() {
        Actions builder = new Actions(driver);
        builder.moveToElement(computersButtonOnSidebar).perform();
    }

    public void clickOnSystemUnitsTab() {
        systemUnitsButtonOnSidebar.click();
    }

    public void clickOnLoginIcon() {
        loginIcon.click();
    }
}
