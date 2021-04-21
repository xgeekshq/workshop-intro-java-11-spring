package com.company.soccer;

public class PersonFluentBuilder implements PlayerFluent,
        PlayerFluent.PlayerFluentCity, PlayerFluent.PlayerFluentCountry {

    @Override
    public PlayerFluentCity name(String name) {
        return null;
    }

    @Override
    public PlayerFluentCountry city(String city) {
        return null;
    }

    @Override
    public Player build() {
        return null;
    }
}
