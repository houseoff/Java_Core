package ru.gb.hw4.view.command;

import ru.gb.hw4.view.ui.MainConsoleUI;

public class ShowOrders extends Command {
    private final MainConsoleUI consoleUI;

    public ShowOrders(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Показать список заказов";
    }

    @Override
    public void execute() {
        consoleUI.getOrdersToString();
    }
}
