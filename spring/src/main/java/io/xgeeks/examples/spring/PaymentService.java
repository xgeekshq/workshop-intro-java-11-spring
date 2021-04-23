package io.xgeeks.examples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
