package ru.gb.hw3.model.comporator;

import ru.gb.hw3.model.Employee;

import java.util.Comparator;

public class EmployeeComparatorByID implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
