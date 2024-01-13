package ru.gb.hw3.view.menu;

import ru.gb.hw3.view.command.Finish;
import ru.gb.hw3.view.command.GetEmployees;
import ru.gb.hw3.view.command.GetFilteredEmployees;
import ru.gb.hw3.view.command.RaiseSalary;
import ru.gb.hw3.view.ui.MainConsoleUI;

public class MainMenu extends Menu {

    public MainMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new GetEmployees(consoleUI));
        commandList.add(new GetFilteredEmployees(consoleUI));
        commandList.add(new RaiseSalary(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
