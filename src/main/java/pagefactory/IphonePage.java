package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class IphonePage extends BasePage{

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@class, 'form-control-max')]")
    private WebElement maxFieldOfPriceFilter;

    @FindBy(xpath = "//div[contains(@class,'open-filter-tooltip')]//span[@class='filter-tooltip-inner']")
    private WebElement showIPhonesButton;

    private static final String SHOW_IPHONES_BUTTON = "//div[contains(@class,'open-filter-tooltip')]//span[@class='filter-tooltip-inner']";

    public void filterIphoneByPrice(final String price) {
        maxFieldOfPriceFilter.clear();
        maxFieldOfPriceFilter.sendKeys(price, Keys.ENTER);
    }

    public By getShowIPhonesButton() {
        return xpath(SHOW_IPHONES_BUTTON);
    }

    public void clickOnShowIPhonesButton() {
       showIPhonesButton.click();
    }
}
