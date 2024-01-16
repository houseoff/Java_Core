package ru.gb.hw4.view.command;

import ru.gb.hw4.view.ui.MainConsoleUI;

public class MakePurchase extends Command {
    private final MainConsoleUI consoleUI;

    public MakePurchase(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Выполнить покупку";
    }

    @Override
    public void execute() {
        consoleUI.makePurchase();
    }
}
