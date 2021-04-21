package com.company.model;

public class PersonApp {

    public static void main(String[] args) {
        Person person = Person.builder().city("Salvador").name("Otavio").country("Brazil").build();
        System.out.println("Person: " + person);
    }
}
