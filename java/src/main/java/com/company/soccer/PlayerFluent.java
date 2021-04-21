package com.company.soccer;

public interface PlayerFluent {

    PlayerFluentCity name(String name);

    interface PlayerFluentCity {
        PlayerFluentCountry city(String city);
    }

    interface PlayerFluentCountry {
      Player build();
    }
}
