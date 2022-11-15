package co.com.choucair.certification.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retotecnico.userinterface.AutomationDemoSiteRegister.WEBTABLE_MESSAGE;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String webtableMessage = Text.of(WEBTABLE_MESSAGE).viewedBy(actor).asString();
        if (question.equals(WEBTABLE_MESSAGE)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}
