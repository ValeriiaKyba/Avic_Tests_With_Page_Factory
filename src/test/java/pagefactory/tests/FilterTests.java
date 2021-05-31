package pagefactory.tests;

import org.testng.annotations.Test;

public class FilterTests extends BaseTest{

    @Test
    public void checkThatAllPricesAreLessThan40000WhenWrite40000InMaxFieldOfPriceFilter() {
        getHomePage().clickOnIphone12ProMaxButton();
        getIphonePage().filterIphoneByPrice("40000");
    }
}
