package ru.gb.hw2.view.command;

import ru.gb.hw2.view.ui.ConsoleUI;

public class Back extends Command {
    private final ConsoleUI consoleUI;

    public Back(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        description = "Назад";
    }

    @Override
    public void execute() {
        consoleUI.back();
    }
}
