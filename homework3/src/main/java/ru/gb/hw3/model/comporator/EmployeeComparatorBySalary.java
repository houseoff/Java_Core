package ru.gb.hw3.model.comporator;

import ru.gb.hw3.model.Employee;

import java.util.Comparator;

public class EmployeeComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}
