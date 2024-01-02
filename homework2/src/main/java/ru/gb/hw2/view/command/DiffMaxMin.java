package ru.gb.hw2.view.command;

import ru.gb.hw2.view.ui.MainConsoleUI;

public class DiffMaxMin extends Command {

    private final MainConsoleUI consoleUI;

    public DiffMaxMin(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Найти разницу между максимумом и минимумом массива";
    }

    @Override
    public void execute() {
        consoleUI.diffMaxMin();
    }
}
