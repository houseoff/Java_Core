package ru.gb.hw1.presenter;

import ru.gb.hw1.model.save.SaveFileHandler;
import ru.gb.hw1.model.save.Writing;
import ru.gb.hw1.view.View;

import java.io.IOException;

public class MainPresenter extends Presenter {

    public MainPresenter(View view) {
        super(view);
    }

    public void recording(String record) {
        try {
            Writing handler = new SaveFileHandler(fileName);
            logger.write(logger.getRecord(record), handler);
            view().print("Запись прошла успешно");
        } catch (IOException e) {
            view().print("При записи произошла ошибка: " + e.getMessage());
        }
    }

}
