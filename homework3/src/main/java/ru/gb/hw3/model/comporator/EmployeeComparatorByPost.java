package ru.gb.hw3.model.comporator;

import ru.gb.hw3.model.Employee;

import java.util.Comparator;

public class EmployeeComparatorByPost implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getPost().compareTo(o2.getPost());
    }
}
