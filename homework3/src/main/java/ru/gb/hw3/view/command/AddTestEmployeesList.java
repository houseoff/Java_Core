package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class AddTestEmployeesList extends Command {

    private final MainConsoleUI consoleUI;

    public AddTestEmployeesList(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Сгенерировать тестовый список работников";
    }

    @Override
    public void execute() { consoleUI.setEmployees(); }
}
