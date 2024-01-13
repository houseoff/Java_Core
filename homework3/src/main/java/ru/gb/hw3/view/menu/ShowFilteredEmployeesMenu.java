package ru.gb.hw3.view.menu;

import ru.gb.hw3.view.command.Back;
import ru.gb.hw3.view.command.FilterSalaryByDesc;
import ru.gb.hw3.view.ui.MainConsoleUI;

public class ShowFilteredEmployeesMenu extends Menu {
    public ShowFilteredEmployeesMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new FilterSalaryByDesc(consoleUI));
        if (consoleUI.previousMenu() != null)
            commandList.add(new Back(consoleUI));
    }
}
