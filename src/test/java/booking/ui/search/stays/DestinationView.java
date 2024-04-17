package booking.ui.search.stays;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DestinationView {

    public static Target txtDestination = Target.the("Enter destination").located(By.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content"));

    public static Target selResult = Target.the("Seleccionar Resultados").located(By.xpath("(//androidx.recyclerview.widget.RecyclerView//android.view.ViewGroup)[1]"));


}
