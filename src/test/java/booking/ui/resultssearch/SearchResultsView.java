package booking.ui.resultssearch;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultsView {
    public static Target listResults = Target.the("Search results").located(By.xpath("(//android.widget.TextView[contains(@text,'2 adul')])[2]"));

    public static Target getPrice = Target.the("price").located(By.xpath("(//android.widget.TextView[@resource-id='com.booking:id/price_view_price'])[2]"));

}
