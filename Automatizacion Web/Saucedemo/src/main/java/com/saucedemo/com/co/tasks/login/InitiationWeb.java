package com.saucedemo.com.co.tasks.login;

import com.saucedemo.com.co.userinterfaces.login.UrlInitiationWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class InitiationWeb implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(UrlInitiationWeb.getURL())
        );
    }

    public static Performable url() {
        return Tasks.instrumented(InitiationWeb.class);
    }
}
