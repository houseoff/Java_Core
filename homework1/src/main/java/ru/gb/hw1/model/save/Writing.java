package ru.gb.hw1.model.save;

import java.io.IOException;
import java.io.Serializable;

public interface Writing {
    void write(Serializable obj) throws IOException;
}
