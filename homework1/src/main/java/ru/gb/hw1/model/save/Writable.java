package ru.gb.hw1.model.save;

import java.io.IOException;
import java.io.Serializable;

public interface Writable {
    void write(Serializable obj, Writing handler) throws IOException;
}
