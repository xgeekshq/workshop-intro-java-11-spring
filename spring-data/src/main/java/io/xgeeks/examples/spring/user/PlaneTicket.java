package io.xgeeks.examples.spring.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PLANE")
public class PlaneTicket extends Ticket {
    @Override
    public TicketType getType() {
        return TicketType.PLAIN;
    }
}
