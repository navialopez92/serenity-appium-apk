package starter.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import starter.tasks.Login;
import starter.tasks.NavigateTo;
import starter.ui.LoginView;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LogInStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("abrimos la APK en el emulador")
    public void openAPK() {
        theActorCalled("Mobile User").can(BrowseTheWeb.with(hisMobileDevice));
    }

    @When("se muestra la pantalla inicial")
    public void mainScreenAppears() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginView.title).isDisplayed()
        );
    }

    @Then("debe verse el título 'Swag Labs' y el botón 'LOGIN'")
    public void displayTitleAndButton() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LoginView.title).isDisplayed(),
                Ensure.that(LoginView.button).text().isEqualTo("LOGIN")
        );
    }


}
