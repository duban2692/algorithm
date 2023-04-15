package com.saucedemo.com.co.userinterfaces.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuSaucedemo {

    public static final Target TEXT_SWAG_LABS = Target.the("SWAG_LABS").located(By.xpath("//div[contains(text(),'Swag Labs')]"));
}
