package ru.gb.hw2.model;

public class Calculations {

    public static int countEvens(int[] array) {
        int cnt = 0;
        for (var item : array) if (item % 2 == 0) cnt++;
        return cnt;
    }

    public static int diffMaxMin(int[] array) {
        int min = array[0], max = 0;
        for (var item : array) {
            if (item < min) min = item;
            if (item > max) max = item;
        }
        return max - min;
    }

    public static boolean isZeroNeighbors(int[] array) {
        for (int i = 0, j = 1; j < array.length; i++, j++)
            if (array[i] == 0 && array[j] == 0) return true;
        return false;
    }

}
