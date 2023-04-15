package com.saucedemo.com.co.models;

public class TransactionLogin {

    private static String strEmail;
    private static String strPassword;

    private TransactionLogin() {
        super();
    }

    public static String getStrEmail() {
        return strEmail;
    }

    public static void setStrEmail(String strEmail) {
        TransactionLogin.strEmail = strEmail;
    }

    public static String getStrPassword() {
        return strPassword;
    }

    public static void setStrPassword(String strPassword) {
        TransactionLogin.strPassword = strPassword;
    }
}
