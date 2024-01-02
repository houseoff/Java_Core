package ru.gb.hw2.view.ui;

import ru.gb.hw2.view.View;
import ru.gb.hw2.view.menu.Menu;

public abstract class ConsoleUI implements View {
    protected Input input;
    protected Menu previousMenu;
    protected Menu currentMenu;
    protected boolean work;

    public ConsoleUI() {
        work  = true;
        input = new Input();
    }

    public void back() {
        currentMenu = previousMenu;
        previousMenu = null;
    }

    protected void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Ошибка при очистке консоли: " + e.getMessage());
        }
    }

    public abstract Menu previousMenu();

}
