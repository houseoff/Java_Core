package ru.gb.hw4.presenter;

import ru.gb.hw4.view.View;

public abstract class Presenter {
    protected View view;
    protected String fileName;

    public Presenter(View view) {
        this.view = view;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public View view() {
        return view;
    }
}
