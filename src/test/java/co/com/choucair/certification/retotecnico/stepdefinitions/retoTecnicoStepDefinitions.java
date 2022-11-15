package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.AutomationDemoSiteUserData;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.Register;
import co.com.choucair.certification.retotecnico.userinterface.AutomationDemoSite;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;

public class retoTecnicoStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than (.*) wants to register$")
    public void thanWantsToRegister(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());

    }

    @When("^he enters his personal data$")
    public void heEntersHisPersonalData(List<AutomationDemoSiteUserData> automationDemoSiteUserData) {
        theActorInTheSpotlight().attemptsTo(
                Register.onThePage(automationDemoSiteUserData)
        );

    }

    @Then("^he must see the (.*)$")
    public void heMustSeeTheWebtable(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }


}
