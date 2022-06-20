package Tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import pageObjects.loginPageObject;

public class inputText {
    public static Performable onField (String fieldType, String value) throws Exception{
        Target field;
        switch (fieldType){
            case "email_field" :
                field = loginPageObject.email_field;
                break;

            case "password_field" :
                field = loginPageObject.password_field;
                break;

            default :
                throw new Exception("There is no field type: " +fieldType);

        }
        return Task.where("{0} input: " + value+ "",
                Enter.theValue(value)
                        .into(field)
        );
    }
}
