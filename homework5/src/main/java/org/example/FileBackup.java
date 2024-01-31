package org.example;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class FileBackup {

    public static void listFiles(File directory, ArrayList<String> outFiles) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) listFiles(file, outFiles);
                else outFiles.add(file.getAbsolutePath());
            }
        }
    }

    public static void backupFiles(String sourceDir) {
        File directory = new File(sourceDir);
        File backupDir = new File("./backup");
        ArrayList<String> outFiles = new ArrayList<>();
        listFiles(directory, outFiles);

        if (!backupDir.exists()) {
            backupDir.mkdir();
        }

        for (var path : outFiles) {
            System.out.println(path);
            File file = new File(path);
            try {
                Files.copy(file.toPath(), new File(backupDir, file.getName()).toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        backupFiles("forbackup");
    }
}