package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class SortById extends Command {

    private final MainConsoleUI consoleUI;

    public SortById(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отсортировать по ID";
    }

    @Override
    public void execute() {
        consoleUI.sortById();
    }
}
