package ru.gb.hw2;

import ru.gb.hw2.view.View;
import ru.gb.hw2.view.ui.MainConsoleUI;

public class Main {
    public static void main(String[] args) {
        View view;
        view = new MainConsoleUI();
        view.start();
    }
}