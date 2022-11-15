package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.model.AutomationDemoSiteUserData;
import static co.com.choucair.certification.retotecnico.userinterface.AutomationDemoSiteRegister.*;

import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.RadioButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;


public class Register implements Task {
    private List<AutomationDemoSiteUserData> automationDemoSiteUserData;

    public Register(List<AutomationDemoSiteUserData> automationDemoSiteUserData){
        this.automationDemoSiteUserData = automationDemoSiteUserData;
    }

    public static Register onThePage(List<AutomationDemoSiteUserData> automationDemoSiteUserData) {
        return Tasks.instrumented(Register.class, automationDemoSiteUserData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(automationDemoSiteUserData.get(0).getFirstName()).into(FIRST_NAME),
                Enter.theValue(automationDemoSiteUserData.get(0).getLastName()).into(LAST_NAME),
                Enter.theValue(automationDemoSiteUserData.get(0).getAddress()).into(ADDRESS),
                Enter.theValue(automationDemoSiteUserData.get(0).getEmailAddress()).into(EMAIL_ADDRESS),
                Enter.theValue(automationDemoSiteUserData.get(0).getPhone()).into(PHONE),
                Click.on(GENDER_MALE),
                Click.on(HOBBIES_MOVIES),
                SelectFromOptions.byVisibleText(automationDemoSiteUserData.get(0).getSkills()).from(SKILLS),
                SelectFromOptions.byVisibleText(automationDemoSiteUserData.get(0).getSelectCountry()).from(SELECT_COUNTRY),
                SelectFromOptions.byVisibleText(automationDemoSiteUserData.get(0).getYear()).from(BIRTH_YEAR),
                SelectFromOptions.byVisibleText(automationDemoSiteUserData.get(0).getMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(automationDemoSiteUserData.get(0).getDay()).from(BIRTH_DAY),
                Enter.theValue(automationDemoSiteUserData.get(0).getPassword()).into(PASSWORD),
                Enter.theValue(automationDemoSiteUserData.get(0).getConfirmPassword()).into(CONFIRM_PASSWORD),
                Click.on(SUBMIT_BTN)
        );
    }
}
