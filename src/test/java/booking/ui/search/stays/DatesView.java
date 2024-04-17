package booking.ui.search.stays;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatesView {

    public static Target dateIn = Target.the("Date In").located(MobileBy.AccessibilityId("24 April 2024"));

    public static Target dateOut = Target.the("Date Out").located(MobileBy.AccessibilityId("08 May 2024"));

    public static Target btnSelDates = Target.the("Select Dates").located(By.id("com.booking:id/facet_date_picker_confirm"));

}
