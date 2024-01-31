package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToBinaryFile {
    public static void main(String[] args) {
        int[] gameField = {0, 1, 2, 3, 0, 1, 2, 3, 0};

        try (FileOutputStream fos = new FileOutputStream("gameField.bin")) {
            for (int i = 0; i < gameField.length; i += 3) {
                int value = (gameField[i] << 6) | (gameField[i + 1] << 4) | (gameField[i + 2] << 2);
                System.out.println(value);
                fos.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
