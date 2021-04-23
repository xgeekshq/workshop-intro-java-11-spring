package io.xgeeks.examples.spring.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BUS")
public class BusTicket extends Ticket {
}
