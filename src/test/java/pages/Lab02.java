package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class Lab02 extends BrowserUtils {
    public Lab02()
    {    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    private WebElement addTariffPlan;


    public void setAddTariffPlan() {
        addTariffPlan.click();
    }


}