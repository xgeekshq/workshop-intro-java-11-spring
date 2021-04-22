package io.xgeeks.examples.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentDescription {

    @Value("${hello.friend}")
    private String message;

    @Override
    public String toString() {
        return "PaymentDescription{" +
                "message='" + message + '\'' +
                '}';
    }
}
