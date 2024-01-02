package ru.gb.hw2.view.command;

import ru.gb.hw2.view.ui.MainConsoleUI;

public class ZeroNeighbors extends Command {

    private final MainConsoleUI consoleUI;

    public ZeroNeighbors(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Есть ли в массиве соседние нули";
    }

    @Override
    public void execute() {
        consoleUI.isZeroNeighbors();
    }
}
