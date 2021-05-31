package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FilterResultsPage extends BasePage{

    public FilterResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> pricesOfFilteredIPhones;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> filteredListOfSystemUnits;

    public ArrayList<Integer> convertPricesIntoIntegerAndAddToIntegerArray() {
        ArrayList<Integer> prices = new ArrayList<>();
        for (WebElement price : pricesOfFilteredIPhones) {
            prices.add(Integer.parseInt(price.getText().replace(" грн", "")));
        }
        return prices;
    }

    public List<WebElement> getFilterResults() {
        return filteredListOfSystemUnits;
    }

}
