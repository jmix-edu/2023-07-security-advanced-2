package com.company.samplesales.entity;

import io.jmix.oidc.user.DefaultJmixOidcUser;

public class AppJmixOidcUser extends DefaultJmixOidcUser {

    private String formattedName;

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }
}
