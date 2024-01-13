package ru.gb.hw3.view.command;

import ru.gb.hw3.view.ui.MainConsoleUI;

public class FilterSalaryByDesc extends Command {

    private final MainConsoleUI consoleUI;

    public FilterSalaryByDesc(MainConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
        this.description = "Отфильтровать ЗП по сумме меньше указанной";
    }

    @Override
    public void execute() {
        consoleUI.filterBySalaryDesc();
    }
}
