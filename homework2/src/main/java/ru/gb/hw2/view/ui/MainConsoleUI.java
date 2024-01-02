package ru.gb.hw2.view.ui;

import ru.gb.hw2.presenter.MainPresenter;
import ru.gb.hw2.view.menu.MainMenu;
import ru.gb.hw2.view.menu.Menu;

public class MainConsoleUI extends ConsoleUI {
    private final MainPresenter mainPresenter;

    public MainConsoleUI() {
        super();
        this.mainPresenter = new MainPresenter(this);
    }

    public void countEvens() {
        mainPresenter.countEvens(input.getIntArray());
    }

    public void diffMaxMin() {
        mainPresenter.diffMaxMin(input.getIntArray());
    }

    @Override
    public void finish() {
        print("Приятного дня!");
        work = false;
    }

    public void isZeroNeighbors() {
        mainPresenter.isZeroNeighbors(input.getIntArray());
    }

    public Menu previousMenu() {
        return previousMenu;
    }

    public void print(String data) {
        print(data, false);
    }

    public void print(String data, Boolean clearConsole) {
        if (clearConsole) clearConsole();
        System.out.println(data);
    }

    public void showMenu(Menu menu) {
        print(menu.getMenu());
        Integer choice = input.getInt(
                "Ввод",
                "\\d+",
                1,
                menu.countItems(),
                "Ошибка ввода. Данный пункт меню не найден");
        menu.execute(choice - 1);
    }

    @Override
    public void start() {
        previousMenu = null;
        welcome();
        while (work) {
            currentMenu = new MainMenu(this);
            showMenu(currentMenu);
        }
    }

    @Override
    public void welcome() {
        print("Добро пожаловать в программу");
    }
}
