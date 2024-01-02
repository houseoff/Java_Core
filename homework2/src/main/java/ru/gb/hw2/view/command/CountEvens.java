package ru.gb.hw2.view.command;

import ru.gb.hw2.view.ui.MainConsoleUI;

public class CountEvens extends Command {

    private final MainConsoleUI consoleUI;

    public CountEvens(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Найти количество четных элементов в массиве";
    }

    @Override
    public void execute() {
        consoleUI.countEvens();
    }
}
