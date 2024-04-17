package booking.ui.home;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;


public class HomeView {
    public static Target closePageInitial = Target.the("Seleccionar opción Alojamientos").located(AppiumBy.accessibilityId("Navigate up"));

}
