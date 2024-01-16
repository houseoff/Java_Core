package ru.gb.hw4.model;

import lombok.Getter;

@Getter
public enum Holiday {
    NEW_YEAR("01.01", "с Новым Годом!"),
    WOMAN_DAY("08.03", "с 8 марта!"),
    MEN_DAY("23.02","с 23 февраля!");

    private final String msg;
    private final String dayOfHoliday;
    Holiday(String dayOfHoliday, String msg) {
        this.dayOfHoliday = dayOfHoliday;
        this.msg = msg;
    }
}
