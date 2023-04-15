package com.saucedemo.com.co.stepdefinitions;

import com.saucedemo.com.co.exceptions.CauseResultNotWaitedException;
import com.saucedemo.com.co.models.TransactionLogin;
import com.saucedemo.com.co.tasks.login.InitiationWeb;
import com.saucedemo.com.co.tasks.login.SubmitsUserAndPassword;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebDriver;

import static com.saucedemo.com.co.userinterfaces.login.MenuSaucedemo.TEXT_SWAG_LABS;
import static com.saucedemo.com.co.util.Utilities.getRandomDriver;
import static net.serenitybdd.core.Serenity.getWebdriverManager;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinitions {

    static WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

    @Before
    public void configurationsActor() {
        TransactionLogin.setStrEmail(System.getProperty("email"));
        TransactionLogin.setStrPassword(System.getProperty("password"));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Duban").can(BrowseTheWeb.with(driver));

    }

    @Given("transactional user navigate to the login page")
    public void transactionalUserNavigateToTheLoginPage() {

        theActorInTheSpotlight().attemptsTo(InitiationWeb.url());

    }

    @When("enter your credentials")
    public void enterYourCredentials() {

        theActorInTheSpotlight().attemptsTo(SubmitsUserAndPassword.inApp(
                TransactionLogin.getStrEmail(), TransactionLogin.getStrPassword()));


    }

    @Then("he should be logged in")
    public void heShouldBeLoggedIn() {

        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(TEXT_SWAG_LABS), isVisible())
                .orComplainWith(CauseResultNotWaitedException.class, "Error al cargar el menu de Saucedemo."));

    }
}
