package io.xgeeks.examples.spring.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PLAIN")
public class PlainTicket extends Ticket{
}
