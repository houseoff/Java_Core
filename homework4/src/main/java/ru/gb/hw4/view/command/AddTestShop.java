package ru.gb.hw4.view.command;

import ru.gb.hw4.view.ui.MainConsoleUI;

public class AddTestShop extends Command {
    private MainConsoleUI consoleUI;

    public AddTestShop(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Создать тестовый магазин";
    }

    @Override
    public void execute() {
        consoleUI.setShop();
    }
}
