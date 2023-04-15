package com.saucedemo.com.co.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginSaucedemo {


    public static final Target INPUT_SIGN_IN = Target.the("UserName").located(By.id("user-name"));

    public static final Target INPUT_TXT_PASSWORD = Target.the("UserPassword").located(By.id("password"));

    public static final Target BTN_SUBMIT = Target.the("BTN_SUBMIT").located(By.id("login-button"));
}
