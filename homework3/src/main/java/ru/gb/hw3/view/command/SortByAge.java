package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class SortByAge extends Command {

    private final MainConsoleUI consoleUI;

    public SortByAge(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отсортировать по возрасту";
    }

    @Override
    public void execute() {
        consoleUI.sortByAge();
    }
}
