package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationDemoSiteRegister extends PageObject {
    public static final Target FIRST_NAME = Target.the("input user first name")
            .located(By.xpath("//input[contains(@placeholder,'First Name')]"));
    public static final Target LAST_NAME = Target.the("input user last name")
            .located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target ADDRESS = Target.the("input address").
            located(By.xpath("//textarea[contains(@ng-model,'Adress')]"));
    public static final Target EMAIL_ADDRESS = Target.the("input email address")
            .located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target PHONE = Target.the("input phone")
            .located(By.xpath("//input[@ng-model='Phone']"));
    public static final Target GENDER_MALE = Target.the("select gender")
            .located(By.xpath("(//input[contains(@value,'Male')])[1]"));
    public static final Target HOBBIES_MOVIES = Target.the("select hobbies")
            .located(By.id("checkbox2"));
    public static final Target LANGUAGES = Target.the("select languages")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select"));
    public static final Target SKILLS = Target.the("input input skills")
            .located(By.id("Skills"));
    public static final Target SELECT_COUNTRY = Target.the("input select country")
            .located(By.id("country"));
    public static final Target BIRTH_YEAR = Target.the("input Date of Birth YEAR")
            .located(By.id("yearbox"));
    public static final Target BIRTH_MONTH = Target.the("input Date of Birth MONTH")
            .located(By.xpath("//select[@placeholder='Month']"));
    public static final Target BIRTH_DAY = Target.the("Date of birth DAY")
            .located(By.id("daybox"));
    public static final Target PASSWORD = Target.the("input password")
            .located(By.id("firstpassword"));
    public static final Target CONFIRM_PASSWORD = Target.the("input confirm password")
            .located(By.id("secondpassword"));
    public static final Target IMAGE = Target.the("input Image")
            .located(By.id("imagesrc"));
    public static final Target SUBMIT_BTN = Target.the("submit button")
            .located(By.id("submitbtn"));
    public static final Target WEBTABLE_MESSAGE = Target.the("success message")
            .located(By.xpath("//h4[contains(.,'- Double Click on Edit Icon to EDIT the Table Row.')]"));
}
