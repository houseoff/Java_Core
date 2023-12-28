package ru.gb.hw1.view.ui;

import ru.gb.hw1.presenter.MainPresenter;
import ru.gb.hw1.view.menu.MainMenu;
import ru.gb.hw1.view.menu.Menu;
import ru.gb.hw1.view.menu.SetFileNameMenu;

import java.io.File;
import java.io.IOException;

public class MainConsoleUI extends ConsoleUI {
    private final MainPresenter mainPresenter;

    public MainConsoleUI() {
        super();
        this.mainPresenter = new MainPresenter(this);
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
        if (clearConsole) {
            clearConsole();
        }
        System.out.println(data);
    }

    public void recording() {
        mainPresenter.recording(input.getString("Введите строку для записи"));
    }

    public void setFileName() {
        String filename = input.getString("Введите имя файла для записи");
        File file = new File(filename);
        if (file.exists()) {
            mainPresenter.setFileName(filename);
            print("Файл " + filename + " успешно выбран для записи");
        } else {
            try {
                if (file.createNewFile()) {
                    print("Создан файл " + filename + " для записи");
                    mainPresenter.setFileName(filename);
                }
                else print("Файл " + filename + " уже существует");
            } catch (IOException e) {
                print("Произошла ошибка при попытке создания файла " + filename + ": " + e.getMessage());
            }
        }
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
            if (null != mainPresenter.getFileName()) currentMenu = new MainMenu(this);
            else currentMenu = new SetFileNameMenu(this);
            showMenu(currentMenu);
        }
    }

    @Override
    public void welcome() {
        print("Добро пожаловать в программу");
    }
}
