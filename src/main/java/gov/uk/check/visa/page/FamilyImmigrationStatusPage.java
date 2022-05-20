package gov.uk.check.visa.page;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//label")
    List<WebElement> immigrationStatus;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;


    public void selectImmigrationStatus(String status){
        for (WebElement menu : immigrationStatus) {
            if (menu.getText().equals(status)) {
                clickOnElement(menu);
                log.info("Clicking on immigration status: " +status+ immigrationStatus.toString());
                break;
            }
        }
    }
    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("Clicking on next step: " + continueButton.toString());
    }

}
