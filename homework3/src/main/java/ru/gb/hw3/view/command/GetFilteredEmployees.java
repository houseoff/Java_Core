package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class GetFilteredEmployees extends Command {

    private final MainConsoleUI consoleUI;

    public GetFilteredEmployees(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отфильтровать список работников";
    }

    @Override
    public void execute() { consoleUI.getFilteredEmployees(); }
}
