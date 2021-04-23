package io.xgeeks.examples.spring.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BUS")
public class BusTicket extends Ticket {

    @JsonIgnore
    @Override
    public TicketType getType() {
        return TicketType.BUS;
    }
}
