package com.company.model;

public class PersonBuilder {
    private String name;
    private String city;
    private String country;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder country(String country) {
        this.country = country;
        return this;
    }

    public Person build() {
        return new Person(name, city, country);
    }
}