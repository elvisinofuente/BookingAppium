package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import booking.questions.VisibleReserveTheseOptionsQuestion;
import booking.ui.chooseyourstay.ChooseYourStay;


public class SelectYourStays implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        Boolean visibleBtnReserveTheseOptions = VisibleReserveTheseOptionsQuestion.value().answeredBy(actor);
        if (visibleBtnReserveTheseOptions)
            actor.attemptsTo(Click.on(ChooseYourStay.btnReserveTheseOptions));
        else
            actor.attemptsTo(Click.on(ChooseYourStay.selectYourStay));
    }
}
