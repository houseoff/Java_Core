package ru.gb.hw4.view.command;

import ru.gb.hw4.view.ui.MainConsoleUI;

public class ShowCustomers extends Command {
    private final MainConsoleUI consoleUI;

    public ShowCustomers(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Показать список покупателей";
    };

    @Override
    public void execute() {
        consoleUI.getCustomersToString();
    }
}
