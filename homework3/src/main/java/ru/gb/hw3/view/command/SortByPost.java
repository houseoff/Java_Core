package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class SortByPost extends Command {
    private final MainConsoleUI consoleUI;

    public SortByPost(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отсортировать по должности";
    }

    @Override
    public void execute() { consoleUI.sortByPost(); }
}
