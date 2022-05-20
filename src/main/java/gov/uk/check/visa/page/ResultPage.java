package gov.uk.check.visa.page;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement getMessage;

    public String getResultMessage() {
        String result = getTextFromElement(getMessage);
        return result;
    }

    public void confirmResultMessage(String expMsg) {

        if (getResultMessage().equalsIgnoreCase(expMsg)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
        log.info("Clicking on reason for visit: " + expMsg + getMessage.getText());
    }

}
