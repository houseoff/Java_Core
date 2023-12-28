package ru.gb.hw1.model;

import ru.gb.hw1.model.save.Writable;
import ru.gb.hw1.model.save.Writing;

import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger implements Serializable, Writable {

    public Logger() {}

    public String getRecord(String record) {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp + " -> " + record;
    }

    @Override
    public void write(Serializable obj, Writing handler) throws IOException {
        handler.write(obj);
    }
}
