package ru.gb.hw4.model.exceptions;

public abstract class CustomException extends Exception {
    protected String msg;

    public CustomException() {
        super();
    }

    public CustomException(String msg) {
        this();
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
