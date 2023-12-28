package ru.gb.hw1.view.menu;

import ru.gb.hw1.view.command.WriteToFile;
import ru.gb.hw1.view.command.Finish;
import ru.gb.hw1.view.ui.MainConsoleUI;

public class MainMenu extends Menu {

    public MainMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new WriteToFile(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
