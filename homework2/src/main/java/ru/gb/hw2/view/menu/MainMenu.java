package ru.gb.hw2.view.menu;

import ru.gb.hw2.view.command.CountEvens;
import ru.gb.hw2.view.command.DiffMaxMin;
import ru.gb.hw2.view.command.Finish;
import ru.gb.hw2.view.command.ZeroNeighbors;
import ru.gb.hw2.view.ui.MainConsoleUI;

public class MainMenu extends Menu {

    public MainMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new CountEvens(consoleUI));
        commandList.add(new DiffMaxMin(consoleUI));
        commandList.add(new ZeroNeighbors(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
