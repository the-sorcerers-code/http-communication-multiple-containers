package com.sorcererscode.service1;

public class MessageDto {
    private String theMessage;
    private int theId;

    public int getTheId() {
        return theId;
    }

    public void setTheId(int theId) {
        this.theId = theId;
    }

    public void setTheMessage(String theMessage) {
        this.theMessage = theMessage;
    }

    public String getTheMessage() {
        return theMessage;
    }
}
