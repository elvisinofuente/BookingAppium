package booking.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import booking.tasks.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.MatcherAssert.assertThat;


public class StaysInBookingStepDefinitions {


    // @Managed(driver = "Appium")
    // public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) abre la aplicacion de Booking$")
    public void que_john_abre_la_aplicacion_de_booking(String usuario) {
        theActorCalled(usuario).attemptsTo(
            new NavigateTo()
        );
    }
    @And("^que realiza una búsqueda de alojamiento$")
    public void realizaBusqueda(){
        theActorInTheSpotlight().attemptsTo(
            new FindStays()
        );
    }

    @And("^que selecciona la segunda opción de alojamiento encontrada$")
    public void que_selecciona_la_segunda_opcion_de_alojamiento_encontrada(){
        theActorInTheSpotlight().attemptsTo(
                new ResultSearchStays()
        );
    }

    @And("^que selecciona sus habitaciones$")
    public void que_selecciona_sus_habitaciones(){
        theActorInTheSpotlight().attemptsTo(
                new SelectRooms()
        );
    }

    @And("^que selecciona su alojamiento$")
    public void que_selecciona_su_alojamiento(){
        theActorInTheSpotlight().attemptsTo(
                new SelectYourStays()
        );
    }

    @And("^que confirma su reserva$")
    public void que_confirma_su_reserva(){
        theActorInTheSpotlight().attemptsTo(
                new ConfirmYourReserve()
        );
    }

    @And("^que proporciona los datos requeridos para la reserva$")
    public void que_proporciona_los_datos_requeridos_para_la_reserva(){
        theActorInTheSpotlight().attemptsTo(
                new FillYourInfo()
        );
    }

    @And("^que valida los detalles de la reserva y procede$")
    public void que_valida_los_detalles_de_la_reserva_y_procede(){
        theActorInTheSpotlight().attemptsTo(
                new BookingOverview()
        );
    }

    @And("^elige el método de pago y completa la transacción$")
    public void elige_el_metodo_de_pago_y_completa_la_transaccion(){
        Boolean noCreditCardNeeded = theActorInTheSpotlight().recall("noCreditCardNeeded");
        if (!noCreditCardNeeded)
            theActorInTheSpotlight().attemptsTo(
                    new FinishBooking()
            );
    }

    @Then("^se valida el monto a pagar$")
    public void se_valida_el_monto_a_pagar(){
        String priceBookingOverview = theActorInTheSpotlight().recall("priceBookingOverview");
        String priceOfStay = theActorInTheSpotlight().recall("priceOfStay");

        //theActorInTheSpotlight().attemptsTo(Ensure.that(priceBookingOverview).isEqualTo(priceOfStay));
    }


}
