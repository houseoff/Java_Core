package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class RaiseSalary extends Command {
    private final MainConsoleUI consoleUI;

    public RaiseSalary(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Проидексировать зар. плату неруководящему составу";
    }

    @Override
    public void execute() { consoleUI.raiseSalary(); }
}
