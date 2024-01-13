package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class GetEmployees extends Command {

    private final MainConsoleUI consoleUI;

    public GetEmployees(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отобразить список работников";
    }

    @Override
    public void execute() { consoleUI.getEmployees(); }
}
