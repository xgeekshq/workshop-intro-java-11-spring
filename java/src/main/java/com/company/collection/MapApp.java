package com.company.collection;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MapApp {

    public static void main(String[] args) {
        Map<String, String> medias = new HashMap<>();
        medias.put("facebook", "otaviojava");
        medias.put("twitter", "otaviojava");
        medias.put("linkedin", "otaviojava");
        System.out.println("The medias values " + medias);
        medias.forEach((k, v) -> System.out.println("the key: " + k + " the value " + v));
        medias.compute("twitter", (k, v) -> k + '-' + v);
        System.out.println("The medias values " + medias);
        medias.computeIfAbsent("social", k -> "no media found: " + k);
        medias.computeIfPresent("social", (k, v) -> k + " " + v);
        System.out.println("The medias values " + medias);
        medias.replaceAll((k, v) -> v.toUpperCase(Locale.ENGLISH));
        System.out.println("The medias values " + medias);
    }
}

