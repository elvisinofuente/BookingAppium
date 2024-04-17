package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;
import booking.questions.VisibleAddressQuestion;
import booking.ui.fillyourinfo.FillInYourInfoView;


public class FillYourInfo implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/


    @Override
    public <T extends Actor> void performAs(T actor) {

        Boolean existAddress = VisibleAddressQuestion.value().answeredBy(actor);

        System.out.println("existAddress-----");
        System.out.println(existAddress);

        if (existAddress){


            actor.attemptsTo(SendKeys.of("First Name").into(FillInYourInfoView.firstName).
                    then(SendKeys.of("Last Name").into(FillInYourInfoView.lastName)).
                    then(SendKeys.of("email@hotmail.com").into(FillInYourInfoView.emailAddress)).
                    then(SendKeys.of("address").into(FillInYourInfoView.address)).
                    then(SendKeys.of("1234").into(FillInYourInfoView.codeZip)).
                    then(SendKeys.of("City").into(FillInYourInfoView.city)).
                    then(Clear.field(FillInYourInfoView.country)).
                    then(SendKeys.of("Angola").into(FillInYourInfoView.country)).
                    then(Click.on(FillInYourInfoView.lblCountry)).
                    then(Click.on(FillInYourInfoView.lblPhone)).
                    //then(Click.on(FillInYourInfoView.lblPhone)).
                    //then(Click.on(FillInYourInfoView.lblCity).then(Scroll.to(FillInYourInfoView.lblCity).andAlignToTop())).


                    then(SendKeys.of("999999999").into(FillInYourInfoView.mobilePhone)).
                    //then(Click.on(FillInYourInfoView.purposeLeisure)).
                    then(Click.on(FillInYourInfoView.btnAddMissingDetails)));

        }else{
            actor.attemptsTo(SendKeys.of("First Name").into(FillInYourInfoView.firstName).
                    then(SendKeys.of("Last Name").into(FillInYourInfoView.lastName)).
                    then(SendKeys.of("email@hotmail.com").into(FillInYourInfoView.emailAddress)).
                    then(Clear.field(FillInYourInfoView.country)).
                    then(SendKeys.of("Angola").into(FillInYourInfoView.country)).
                    then(SendKeys.of("999999999").into(FillInYourInfoView.mobilePhone)).
                    then(Click.on(FillInYourInfoView.purposeLeisure)).
                    then(Click.on(FillInYourInfoView.btnAddMissingDetails)));
        }

    }
}
