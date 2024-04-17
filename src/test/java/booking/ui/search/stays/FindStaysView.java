package booking.ui.search.stays;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FindStaysView {

    public static Target txtDestination = Target.the("Enter your destination").located(By.id("com.booking:id/facet_search_box_accommodation_destination"));

    public static Target txtDates = Target.the("Set Dates").located(By.id("com.booking:id/facet_search_box_accommodation_dates"));

    public static Target txtRoomsAndPersons = Target.the("Enter no rooms and persons").located(By.id("com.booking:id/facet_search_box_accommodation_occupancy"));

    public static Target btnSearch = Target.the("Click button search").located(By.id("com.booking:id/facet_search_box_cta"));


}
