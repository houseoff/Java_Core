package ru.gb.hw3.view.menu;

import ru.gb.hw3.view.command.*;
import ru.gb.hw3.view.ui.MainConsoleUI;

public class ShowEmployeesMenu extends Menu {
    public ShowEmployeesMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new SortById(consoleUI));
        commandList.add(new SortByName(consoleUI));
        commandList.add(new SortByPost(consoleUI));
        commandList.add(new SortBySalary(consoleUI));
        commandList.add(new SortByAge(consoleUI));
        if (consoleUI.previousMenu() != null)
            commandList.add(new Back(consoleUI));
    }
}
