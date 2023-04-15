package com.saucedemo.com.co.userinterfaces.login;

import com.saucedemo.com.co.util.Utilities;

public enum UrlInitiationWeb {

    UrlInitiationWebDev("https://www.saucedemo.com/dev", "dev"),
    UrlInitiationWebCert("https://www.saucedemo.com/", "cert"),
    UrlInitiationWebProd("https://www.saucedemo.com/pro", "prod");

    private final String url;
    private final String Environments;

    UrlInitiationWeb(String url, String environments) {
        this.url = url;
        Environments = environments;
    }

    public String getUrl() {
        return url;
    }

    public String getEnvironments() {
        return Environments;
    }

    public String Url() {

        return url;
    }

    public static String getURL() {

        String url = null;
        for (UrlInitiationWeb urlInitiationWeb : UrlInitiationWeb.values()) {

            if (Utilities.getEnvironments().equals(urlInitiationWeb.getEnvironments())) {

                url = urlInitiationWeb.getUrl();
                break;
            }
        }

        return url;
    }
}
