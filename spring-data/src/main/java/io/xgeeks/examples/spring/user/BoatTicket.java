package io.xgeeks.examples.spring.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BOAT")
public class BoatTicket extends Ticket {
    @Override
    public TicketType getType() {
        return TicketType.BOAT;
    }
}
