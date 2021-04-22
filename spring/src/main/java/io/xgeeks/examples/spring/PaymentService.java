package io.xgeeks.examples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final Payment payment;

    @Autowired
    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PaymentService{" +
                "payment=" + payment +
                '}';
    }
}
