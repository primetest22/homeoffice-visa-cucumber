package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.page.*;

public class VisaConfirmationTestSteps {
    @Given("^I am on the Check UK visa website$")
    public void iAmOnTheCheckUKVisaWebsite() throws InterruptedException {
        new StartPage().clickStartNow();
    }

    @And("^I start visa check$")
    public void iStartVisaCheck() {
    }

    @When("^I select a nationality of 'Australia'$")
    public void iSelectANationalityOfAustralia() {
        new SelectNationalityPage().selectNationality("Australia");
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I select reason 'Tourism'$")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisit("Tourism or visiting family and friends");
        new ReasonForTravelPage().clickNextStepButton();
    }

    @Then("^I will be informed 'You will not need a visa to come to the UK'$")
    public void iWillBeInformedYouWillNotNeedAVisaToComeToTheUK() {
        new ResultPage().confirmResultMessage("You will not need a visa to come to the UK");
    }

    @When("^I select a nationality of 'Chile'$")
    public void iSelectANationalityOfChile() {
        new SelectNationalityPage().selectNationality("Chile");
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I select reason 'Work'$")
    public void iSelectReasonWork() {
        new ReasonForTravelPage().selectReasonForVisit("Work, academic visit or business");
        new ReasonForTravelPage().clickNextStepButton();
    }

    @And("^I state I am intending to stay for 'more than six' months$")
    public void iStateIAmIntendingToStayForMoreThanMonths() {
        new DurationOfStayPage().selectLengthOfStay("longer than 6 months");
        new DurationOfStayPage().clickNextStepButton();
    }

    @And("^I state I have planning to work 'health' types of job$")
    public void iStateIHavePlanningToWorkHealthTypesOfJob() {
        new WorkTypePage().selectJobType("Health and care professional");
        new WorkTypePage().clickNextStepButton();
    }

    @Then("^I will be informed 'You need a visa to work in health and care'$")
    public void iWillBeInformedYouNeedAVisaToWorkInHealthAndCare() {
        new ResultPage().confirmResultMessage("You need a visa to work in health and care");
    }

    @When("^I select a nationality of 'Colombia'$")
    public void iSelectANationalityOfColombia() {
        new SelectNationalityPage().selectNationality("Colombia");
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I select reason 'family'$")
    public void iSelectReasonFamily() {
        new ReasonForTravelPage().selectReasonForVisit("Join partner or family for a long stay");
        new ReasonForTravelPage().clickNextStepButton();
    }

    @And("^I state My partner or family member have uk immigration status 'yes'$")
    public void iStateMyPartnerOrFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus("Yes");
        new FamilyImmigrationStatusPage().clickNextStepButton();
    }

    @Then("^I will be informed 'You’ll need a visa to join your family or partner in the UK'$")
    public void iWillBeInformedYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        new ResultPage().confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
    }
}
