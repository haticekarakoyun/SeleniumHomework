package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Lab02;
import pages.lab02SecondPage;
import pages.lab02ThirdPage;
import utils.BrowserUtils;
import utils.ConfigurationsReader;
import utils.Driver;

import java.util.Map;

public class lab02Steps extends BrowserUtils {
    Lab02 lab022 = new Lab02();
    lab02SecondPage lab02SecondPagee = new lab02SecondPage();
    lab02ThirdPage hatice = new lab02ThirdPage();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {

        Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));

    }

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        BrowserUtils.staticWait(3);
        lab022.setAddTariffPlan();
    }

    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {
        BrowserUtils.staticWait(3);
        lab02SecondPagee.setVerifyAddTariffPlan(string);

    }

    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {
        BrowserUtils.staticWait(3);
        //   lab022.setAddTariffPlan();
        lab02SecondPagee.setMonthlyRental(dataTable.get("Monthly Rental"));
        lab02SecondPagee.setFreeLocalMinutes(dataTable.get("Free Local Minutes"));
        lab02SecondPagee.setFreeIntMinutes(dataTable.get("Free International Minutes"));
        lab02SecondPagee.setSmsPack(dataTable.get("Free SMS Pack"));
        lab02SecondPagee.setLocalPerMinutesCharge(dataTable.get("Local Per Minutes Charges"));
        lab02SecondPagee.setIntPerMinutesCharge(dataTable.get("International Per Minutes Charges"));
        lab02SecondPagee.setSmsCharge(dataTable.get("SMS Per Charges"));

    }

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        lab02SecondPagee.setSubmit();


    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        BrowserUtils.staticWait(3);
        hatice.setVerifyMessage();

    }
}
