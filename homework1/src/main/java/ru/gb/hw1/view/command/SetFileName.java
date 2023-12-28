package ru.gb.hw1.view.command;

import ru.gb.hw1.view.ui.MainConsoleUI;

public class SetFileName extends Command {
    private final MainConsoleUI consoleUI;

    public SetFileName(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        description = "Указать файл для записи логов";
    }

    @Override
    public void execute() {
        consoleUI.setFileName();
    }
}
