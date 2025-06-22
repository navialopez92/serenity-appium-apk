package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {

  public static Target title = Target.the("title")
          .located(AppiumBy.xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]"));

  public static  Target username = Target.the("username")
            .located(AppiumBy.accessibilityId("test-Username"));

  public static Target password = Target.the("pasword")
            .located(AppiumBy.accessibilityId("test-Password"));

  public static Target button = Target.the("login button")
            .located(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN\"]"));
}
