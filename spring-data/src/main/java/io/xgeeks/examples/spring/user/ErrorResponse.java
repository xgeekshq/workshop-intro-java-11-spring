package io.xgeeks.examples.spring.user;

import java.util.List;

public class ErrorResponse {

    private final int status;

    private final List<String> messages;


    public ErrorResponse(int status, List<String> messages) {
        this.status = status;
        this.messages = messages;
    }

    public int getStatus() {
        return status;
    }

    public List<String> getMessages() {
        return messages;
    }
}
