package io.xgeeks.examples.spring.user;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum TicketType {
    PLAIN, BUS, BOAT
}
