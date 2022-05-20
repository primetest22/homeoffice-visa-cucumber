package gov.uk.check.visa.page;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> needUKVisa;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectReasonForVisit(String reason) {
        for (WebElement menu : needUKVisa) {
            if (menu.getText().equals(reason)) {
                clickOnElement(menu);
                log.info("Clicking on reason for visit: " + reason + needUKVisa.toString());
                break;
            }
        }
    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("Clicking on next step: " + continueButton.toString());
    }

}
