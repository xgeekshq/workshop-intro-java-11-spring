package io.xgeeks.examples.spring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FruitNotFoundException extends RuntimeException {

    public FruitNotFoundException(String message) {
        super(message);
    }
}
