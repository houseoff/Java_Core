package ru.gb.hw3.view.menu;

import ru.gb.hw3.view.command.AddTestEmployeesList;
import ru.gb.hw3.view.command.Finish;
import ru.gb.hw3.view.ui.MainConsoleUI;

public class MainMenuWithoutEmployees extends Menu {
    public MainMenuWithoutEmployees(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new AddTestEmployeesList(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
