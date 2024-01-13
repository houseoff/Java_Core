package ru.gb.hw3.view.command;

public abstract class Command {
    protected String description;

    public String description() {
        return description;
    }

    public abstract void execute();
}
