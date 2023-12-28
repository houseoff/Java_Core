package ru.gb.hw1;

import ru.gb.hw1.view.View;
import ru.gb.hw1.view.ui.MainConsoleUI;

public class Main {
    public static void main(String[] args) {
        View view;
        view = new MainConsoleUI();
        view.start();
    }
}