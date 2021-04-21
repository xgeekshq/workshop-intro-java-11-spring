package com.company.model;

public interface PersonFluent {

    PersonFluentCity city(String city);

    interface PersonFluentCity {
        PersonFluentCountry country(String country);
    }

    interface PersonFluentCountry {
        Person build();
    }

}
