package com.company.function;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {
        Supplier<String> database= () -> "From database";
        String text = null;
        Optional<String> optional = Optional.ofNullable(text);
        System.out.println("The value is: " + optional.orElseGet(database));
    }
}
