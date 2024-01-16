package ru.gb.hw4.view.menu;

import ru.gb.hw4.view.command.*;
import ru.gb.hw4.view.ui.MainConsoleUI;

public class MainMenu extends Menu {

    public MainMenu(MainConsoleUI consoleUI) {
        super(consoleUI);
        commandList.add(new MakePurchase(consoleUI));
        commandList.add(new ShowCustomers(consoleUI));
        commandList.add(new ShowProducts(consoleUI));
        commandList.add(new ShowOrders(consoleUI));
        commandList.add(new Finish(consoleUI));
    }
}
