package ru.gb.hw4.model;

public class IDMaker {
    private int id;
    public IDMaker() {}
    public IDMaker(int startId) {
        this.id = Math.max(0, startId);
    }
    public int getId() {return ++id;}
    public int showLastId() {return id;}
}
