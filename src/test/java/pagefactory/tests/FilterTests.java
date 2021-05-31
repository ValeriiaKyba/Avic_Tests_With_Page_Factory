package pagefactory.tests;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertTrue;

public class FilterTests extends BaseTest{

    private static final long TIME_TO_WAIT = 30;
    private static final String PRICE_FOR_FILTERING = "40000";

    @Test
    public void checkThatAllPricesAreLessThan40000WhenWrite40000InMaxFieldOfPriceFilter() {
        getHomePage().clickOnIphone12ProMaxButton();
        getIphonePage().filterIphoneByPrice(PRICE_FOR_FILTERING);
        getIphonePage().waitForVisibilityOfElement(TIME_TO_WAIT, getIphonePage().getShowIPhonesButton());
        getIphonePage().clickOnShowIPhonesButton();
        ArrayList<Integer> integerPrices = getFilterPage().convertPricesIntoIntegerAndAddToIntegerArray();
        for (Integer price: integerPrices) {
            assertTrue(price < Integer.parseInt(PRICE_FOR_FILTERING));
        }
    }
}
