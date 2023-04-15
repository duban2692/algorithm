package com.saucedemo.com.co.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SubmitsUserAndPassword implements Task {

    private String email;
    private String password;

    public SubmitsUserAndPassword(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Login.into(email, password));
    }

    public static SubmitsUserAndPassword inApp(String email, String password) {
        return instrumented(SubmitsUserAndPassword.class, email, password);
    }
}
