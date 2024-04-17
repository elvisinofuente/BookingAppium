package booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.*;

import booking.ui.search.stays.*;


public class FindStays implements Performable {
    /*AndroidDriver<AndroidElement> androidDriver() {
        return (AndroidDriver<AndroidElement>)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }*/
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(FindStaysView.txtDestination).
                then(SendKeys.of("arequipa").into(DestinationView.txtDestination)).

                then(Click.on(DestinationView.selResult)).
                then(Click.on(DatesView.dateIn)).
                then(Click.on(DatesView.dateOut)).
                then(Click.on(DatesView.btnSelDates)).
                then(Click.on(FindStaysView.txtRoomsAndPersons)).
                then(Click.on(RoomsAndGuestsView.plusChildren)).
                then(Click.on(AgeOfChildView.selAge)).
                then(Click.on(AgeOfChildView.minorOneYearsOld)).
                then(Click.on(AgeOfChildView.oneYearsOld)).
                then(Click.on(AgeOfChildView.twoYearsOld)).
                then(Click.on(AgeOfChildView.threeYearsOld)).
                then(Click.on(AgeOfChildView.fourYearsOld)).
                then(Click.on(AgeOfChildView.fiveYearsOld)).
                then(Click.on(AgeOfChildView.btnOk)).
                then(Click.on(RoomsAndGuestsView.btnApply)).
                then(Click.on(FindStaysView.btnSearch)));
    }
}
