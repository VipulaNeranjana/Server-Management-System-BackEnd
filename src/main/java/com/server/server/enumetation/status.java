package com.server.server.enumetation;

public enum status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    status(String status){
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
