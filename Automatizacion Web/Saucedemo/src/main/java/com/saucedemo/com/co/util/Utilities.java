package com.saucedemo.com.co.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

public class Utilities {

    private static final Logger LOGGER = LoggerFactory.getLogger(Utilities.class);

    public static final ResourceBundle SERENITY = ResourceBundle.getBundle("environment");

    public static String getEnvironments() {

        return SERENITY.getString("environment");
    }

    public static String getRandomDriver() {
        String[] drivers = {"chrome"}; //   {"chrome", "firefox", "edge"};
        int r = (int) Math.floor(Math.random() * drivers.length);
        return drivers[r];
    }
}
