package ru.gb.hw4.model.exceptions;

public class ProductException extends CustomException {

    public ProductException() {
        this.msg = "Указанный товар отсутствует";
    }

    public ProductException(String msg) {
        super(msg);
    }
}
