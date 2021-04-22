package io.xgeeks.examples.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SpringApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringApp.class);
        PaymentService payment = context.getBean(PaymentService.class);
        System.out.println(payment);
        System.out.println( context.getBean(PaymentDescription.class));

    }
}
