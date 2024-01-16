package ru.gb.hw4.view.command;

import ru.gb.hw4.view.ui.ConsoleUI;

public class Finish extends Command {
    private final ConsoleUI consoleUI;

    public Finish(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Выход из программы";
    }

    @Override
    public void execute() { consoleUI.finish(); }
}
