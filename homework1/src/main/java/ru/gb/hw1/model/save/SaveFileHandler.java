package ru.gb.hw1.model.save;

import java.io.*;

public class SaveFileHandler implements Writing {
    private final String fileName;

    public SaveFileHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(Serializable obj) throws IOException {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(obj + "\n");
        }
    }
}
