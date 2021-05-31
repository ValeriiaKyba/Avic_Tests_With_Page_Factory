package pagefactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IphonePage extends BasePage{

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@class, 'form-control-max')]")
    private WebElement maxFieldOfPriceFilter;

    public void filterIphoneByPrice(final String price) {
        maxFieldOfPriceFilter.clear();
        maxFieldOfPriceFilter.sendKeys(price, Keys.ENTER);
    }
}
