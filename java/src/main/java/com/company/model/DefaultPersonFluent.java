package com.company.model;

public class DefaultPersonFluent implements PersonFluent, PersonFluent.PersonFluentCity {

    private String name;

    private String city;

    private String country;
    public DefaultPersonFluent(String name) {
        this.name = name;
    }

    @Override
    public PersonFluentCity city(String city) {
        this.city = city;
        return this;
    }

    @Override
    public Person build() {
        return null;
    }
}
