package ru.gb.hw3.presenter;

import ru.gb.hw3.view.View;

public abstract class Presenter {
    protected View view;

    public Presenter(View view) {
        this.view = view;
    }

    public View view() {
        return view;
    }
}
