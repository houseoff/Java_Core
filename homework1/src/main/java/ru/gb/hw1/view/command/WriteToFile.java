package ru.gb.hw1.view.command;

import ru.gb.hw1.view.ui.MainConsoleUI;

public class WriteToFile extends Command {
    private final MainConsoleUI consoleUI;

    public WriteToFile(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        description = "Записать в лог-файл";
    }

    @Override
    public void execute() {
        consoleUI.recording();
    }
}
