package ru.gb.hw4.view.menu;

import ru.gb.hw4.view.command.AddTestShop;
import ru.gb.hw4.view.command.Finish;
import ru.gb.hw4.view.ui.MainConsoleUI;

public class MainMenuWithoutShop extends Menu {
    public MainMenuWithoutShop(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new AddTestShop(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
