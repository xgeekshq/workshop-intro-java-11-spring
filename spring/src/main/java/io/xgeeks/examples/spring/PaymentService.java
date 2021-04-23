package io.xgeeks.examples.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private final Payment payment;

    public PaymentService(@Qualifier("creditCard") Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PaymentService{" +
                "payment=" + payment +
                '}';
    }
}
