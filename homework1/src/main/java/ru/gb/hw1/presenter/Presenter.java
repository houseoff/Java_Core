package ru.gb.hw1.presenter;

import ru.gb.hw1.model.Logger;
import ru.gb.hw1.view.View;

public abstract class Presenter {
    protected View view;
    protected Logger logger;
    protected String fileName;

    public Presenter(View view) {
        this.view = view;
        this.logger = new Logger();
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
