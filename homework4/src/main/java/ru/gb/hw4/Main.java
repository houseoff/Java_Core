package ru.gb.hw4;

import ru.gb.hw4.view.View;
import ru.gb.hw4.view.ui.MainConsoleUI;

public class Main {
    public static void main(String[] args) {
        View view;
        view = new MainConsoleUI();
        view.start();
    }
}