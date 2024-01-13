package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class SortBySalary extends Command {
    private final MainConsoleUI consoleUI;

    public SortBySalary(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отсортировать по заработной плате";
    }

    @Override
    public void execute() { consoleUI.sortBySalary(); }
}
