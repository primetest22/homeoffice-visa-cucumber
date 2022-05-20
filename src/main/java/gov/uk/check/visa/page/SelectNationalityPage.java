package gov.uk.check.visa.page;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement findNationality;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(findNationality, nationality);
        log.info("Clicking on reason for visit: " + nationality + findNationality.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next step: " + nextStepButton.toString());
    }

}
