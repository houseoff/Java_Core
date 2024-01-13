package ru.gb.hw3;

import ru.gb.hw3.view.View;
import ru.gb.hw3.view.ui.MainConsoleUI;

public class Main {
    public static void main(String[] args) {
        View view;
        view = new MainConsoleUI();
        view.start();
    }
}