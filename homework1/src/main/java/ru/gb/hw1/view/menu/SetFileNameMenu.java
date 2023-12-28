package ru.gb.hw1.view.menu;

import ru.gb.hw1.view.command.Finish;
import ru.gb.hw1.view.command.SetFileName;
import ru.gb.hw1.view.ui.MainConsoleUI;

public class SetFileNameMenu extends Menu {

    public SetFileNameMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new SetFileName(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
