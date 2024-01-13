package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.ConsoleUI;

public class Finish extends Command {
    private final ConsoleUI consoleUI;

    public Finish(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Выход из программы";
    }

    @Override
    public void execute() { consoleUI.finish(); }
}
