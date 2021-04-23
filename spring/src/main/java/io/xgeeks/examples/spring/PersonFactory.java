package io.xgeeks.examples.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class PersonFactory {

    @Bean
    //@Produces
    public Person getPerson() {
        Person ricardo = new Person("Ricardo");
        return ricardo;
    }

    @Bean
    public BigDecimal getValue() {
        return BigDecimal.TEN;
    }
}
