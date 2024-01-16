package ru.gb.hw4.view.ui;

import ru.gb.hw4.presenter.MainPresenter;
import ru.gb.hw4.view.menu.MainMenu;
import ru.gb.hw4.view.menu.MainMenuWithoutShop;
import ru.gb.hw4.view.menu.Menu;

public class MainConsoleUI extends ConsoleUI {
    private final MainPresenter presenter;

    public MainConsoleUI() {
        super();
        this.presenter = new MainPresenter(this);
    }

    @Override
    public void finish() {
        print("Количество совершенных покупок: " + presenter.getSalesCount());
        presenter.congratulation();
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
            if (presenter.isEmptyShop()) currentMenu = new MainMenuWithoutShop(this);
            else currentMenu = new MainMenu(this);
            showMenu(currentMenu);
        }
    }

    @Override
    public void welcome() {
        print("Добро пожаловать в программу: тестовый режим");
    }

    // Работа с презентером
    public void setShop() {
        presenter.setShop();
    }

    public void makePurchase() {
        presenter.makePurchase(
                input.getString("Введите имя покупателя"),
                input.getString("Введите наименование товара"),
                input.getInt(
                        "Введите количество товара",
                        "^[1-9]|[1-9]([0-9])*$",
                        "Введите положительное целое число")
        );
    }

    public void getCustomersToString() {
        presenter.getCustomersToString();
    }

    public void getProductsToString() {
        presenter.getProductsToString();
    }

    public void getOrdersToString() {
        presenter.getOrdersToString();
    }
}
