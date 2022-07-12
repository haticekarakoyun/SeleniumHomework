package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

public class lab02ThirdPage extends BrowserUtils {

    public lab02ThirdPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(tagName ="h2")
    private WebElement hatice;

    public void setVerifyMessage() {
        hatice.click();

    }
}
