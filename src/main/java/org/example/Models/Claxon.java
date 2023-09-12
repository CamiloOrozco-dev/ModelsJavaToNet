package org.example.Models;

public enum Claxon {

    HORN_SOUND("Piiiii!");
    private String message ;

    Claxon(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
