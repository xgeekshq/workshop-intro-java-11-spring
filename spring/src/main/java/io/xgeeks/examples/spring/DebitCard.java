package io.xgeeks.examples.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DebitCard implements Payment{
}
