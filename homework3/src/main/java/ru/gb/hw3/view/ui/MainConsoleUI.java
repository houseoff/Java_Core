package ru.gb.hw3.view.ui;

import ru.gb.hw3.presenter.MainPresenter;
import ru.gb.hw3.view.menu.MainMenu;
import ru.gb.hw3.view.menu.MainMenuWithoutEmployees;
import ru.gb.hw3.view.menu.Menu;

public class MainConsoleUI extends ConsoleUI {
    private final MainPresenter presenter;

    public MainConsoleUI() {
        super();
        this.presenter = new MainPresenter(this);
    }

    @Override
    public void finish() {
        print("Приятного дня!");
        work = false;
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
            if (presenter.isEmptyEmployeesList()) currentMenu = new MainMenuWithoutEmployees(this);
            else currentMenu = new MainMenu(this);
            showMenu(currentMenu);
        }
    }

    @Override
    public void welcome() {
        print("Добро пожаловать в программу: тестовый режим");
    }

    // Работа с презентером
    public void getEmployees() {
        presenter.getEmployees();
    }

    public void setEmployees() {
        presenter.setEmployees();
    }

    public void raiseSalary() {
        presenter.raiseSalary(input.getDouble(
                "Введите сумму для индексации",
                "^(0\\.|[1-9](\\d+)?)\\.?(\\d+)?$",
                "Ошибка: вы ввели неверное число")
        );
    }
}
