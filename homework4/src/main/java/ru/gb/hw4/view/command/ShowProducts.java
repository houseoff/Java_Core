package ru.gb.hw4.view.command;

import ru.gb.hw4.view.ui.MainConsoleUI;

public class ShowProducts extends Command {
    private final MainConsoleUI consoleUI;

    public ShowProducts(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Показать список продуктов";
    }

    @Override
    public void execute() {
        consoleUI.getProductsToString();
    }
}
