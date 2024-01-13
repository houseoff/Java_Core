package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class SortByName extends Command {
    private final MainConsoleUI consoleUI;

    public SortByName(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отсортировать по имени";
    }

    @Override
    public void execute() { consoleUI.sortByName(); }
}
