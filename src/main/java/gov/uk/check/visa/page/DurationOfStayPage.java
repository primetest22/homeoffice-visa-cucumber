package gov.uk.check.visa.page;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> selectStay;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;


    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "6 months or less":
                selectStay.get(0).click();
                break;
            case "longer than 6 months":
                selectStay.get(1).click();
                break;
        }
    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("Clicking on next step: " + continueButton.toString());
    }

}
