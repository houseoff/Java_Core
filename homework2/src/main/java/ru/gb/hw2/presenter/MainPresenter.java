package ru.gb.hw2.presenter;

import ru.gb.hw2.model.Calculations;
import ru.gb.hw2.view.View;

public class MainPresenter extends Presenter {

    public MainPresenter(View view) {
        super(view);
    }

    public void countEvens(int[] array) {
        view().print("Количество четных чисел в массиве равно " + String.valueOf(Calculations.countEvens(array)));
    }

    public void diffMaxMin(int[] array) {
        view().print("Разница между максимумом и минимумом массива равна " + String.valueOf(Calculations.diffMaxMin(array)));
    }

    public void isZeroNeighbors(int[] array) {
        view().print("Есть нулевые соседи в массиве: " + String.valueOf(Calculations.isZeroNeighbors(array)));
    }
}
