package com.company.function;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierApp {

    public static void main(String[] args) {
        Supplier<String> cache = () -> "From Database";
        Optional<String> query = Optional.empty();
        System.out.println(query.orElseGet(cache));
    }
}
