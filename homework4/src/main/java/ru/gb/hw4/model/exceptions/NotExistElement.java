package ru.gb.hw4.model.exceptions;

public class NotExistElement extends CustomException {
    public NotExistElement() {
        this.msg = "Элемент не найден";
    }

    public NotExistElement(String msg) {
        super(msg);
    }
}
