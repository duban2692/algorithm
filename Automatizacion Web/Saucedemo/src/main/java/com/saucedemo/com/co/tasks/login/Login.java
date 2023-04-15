package com.saucedemo.com.co.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.com.co.userinterfaces.login.LoginSaucedemo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {


    private String txtEmail;
    private String txtPassword;

    public Login(String txtEmail, String txtPassword) {
        this.txtEmail = txtEmail;
        this.txtPassword = txtPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(txtEmail).into(INPUT_SIGN_IN),
                Enter.theValue(txtPassword).into(INPUT_TXT_PASSWORD),
                Click.on(BTN_SUBMIT));
    }

    public static Login into(String txtEmail, String txtPassword) {
        return instrumented(Login.class, txtEmail, txtPassword);
    }
}
