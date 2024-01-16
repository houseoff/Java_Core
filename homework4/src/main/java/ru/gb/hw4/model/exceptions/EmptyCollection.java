package ru.gb.hw4.model.exceptions;

public class EmptyCollection extends CustomException {
    public EmptyCollection() {
        this.msg = "Список пуст";
    }

    public EmptyCollection(String msg) {
        super(msg);
    }
}
