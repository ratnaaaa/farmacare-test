package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bookdepository.com/")
public class loginPageObject extends PageObject {

    public static Target loginIcon = Target.the("login icon")
            .locatedBy("//div[@class='page-slide']//ul[@class='right-nav mobile-nav-content']//li[3]//a[1]");
    public static Target email_field = Target.the("email field")
            .locatedBy("#ap_email");
    public static Target password_field = Target.the("password field")
            .locatedBy("#ap_password");
    public static Target bottonSignIn = Target.the("button sign in")
            .locatedBy("#signInSubmit");

}
