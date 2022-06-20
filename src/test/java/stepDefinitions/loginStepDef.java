package stepDefinitions;

import Tasks.ClickOn;
import Tasks.inputText;
import Tasks.navigateTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;

public class loginStepDef {

    @Given("{actor} open Book Depository Page")
    public void loadHRMLoginPage(Actor actor) throws Exception{
        actor.wasAbleTo(navigateTo.theURL("Book Depository Login"));
    }
    @When("{actor} click login icon")
    public void clickLoginIcon(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("Icon login")
        );

    }
    @And("{actor} input email and password")
    public void inputCredential(Actor actor) throws Exception{
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("email_field");
        String password = dotenv.get("password_field");

        actor.attemptsTo(
                inputText.onField("email_field", email),
                inputText.onField("password_field", password)
        );

    }
    @And("{actor} click login button")
    public void clickLoginButton(Actor actor) throws Exception{
        actor.attemptsTo(
                ClickOn.button("button sign in")
        );

    }
    @Then("{actor} can login successfully")
    public void validateLoginSuccess(Actor actor){

    }
}
