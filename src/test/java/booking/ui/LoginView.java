package booking.ui;
import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.AppiumBy;


import org.openqa.selenium.By;

public class LoginView {
    public static Target username = Target.the("username").located(AppiumBy.accessibilityId("username"));
    public static Target password = Target.the("password").located(AppiumBy.accessibilityId("password"));
    public static Target btnLogin = Target.the("btnLogin").located(By.xpath("//android.view.ViewGroup[@content-desc='loginBtn']/android.widget.TextView"));    
}
