package io.xgeeks.examples.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;

@ComponentScan
public class SpringApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringApp.class);
        Person bean = context.getBean(Person.class);
        System.out.println("The result: " + bean);
        PaymentService service = context.getBean(PaymentService.class);
        System.out.println("The payment service: " + service);
        BigDecimal decimal = context.getBean(BigDecimal.class);
        System.out.println("The big decimal: " + decimal);

    }
}
