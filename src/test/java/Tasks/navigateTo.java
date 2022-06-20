package Tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pageObjects.loginPageObject;

public class navigateTo {

    public static Performable theURL(String urlType) throws Exception {
        Class url;

        switch (urlType) {
            case "Book Depository Login":
                url = loginPageObject.class;
                break;
            default:
                throw new Exception("There is no url type: " + urlType);
        }
        return Task.where("{0} access the login url",
                Open.browserOn().the(url));
    }

}
