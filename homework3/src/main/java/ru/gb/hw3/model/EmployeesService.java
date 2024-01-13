package ru.gb.hw3.model;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeesService {
    public static ArrayList<Employee> createTestEmployeesList() {
        var list = new ArrayList<Employee>();
        list.add(new Employee("John", "Engineer", "11111111111", 50_000, 20));
        list.add(new Employee("Ben", "HR", "22222222222", 50_000, 25));
        list.add(new Employee("Mark", "Java Developer", "33333333333", 50_000, 30));
        list.add(new Employee("Tim", "DevOps", "44444444444", 50_000, 35));
        list.add(new Head("Bryce", "Head", "55555555555", 200_000, 40));
        return list;
    }

    private ArrayList<Employee> employees;

    public EmployeesService() {
        this.employees = new ArrayList<>();
    }

    public String raiseSalary(double increase) {
        if (employees.isEmpty()) return "Список работников пуст. Индексация невозможна";
        boolean flag = false;

        for (var emp : employees)
            if (!(emp instanceof Head)) {
                flag = true;
                emp.setSalary(emp.getSalary() + increase);
            }

        if (flag) return "Зарплата неруководящему составу успешно проидексирована";
        else      return "Список состоит из работников руководящего состава. Индексация невозможна";
    }

    public String getEmployees() {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (var emp : employees) {
            counter++;
            sb.append(emp);
            if (counter != employees.size()) sb.append("\n");
        }
        return sb.toString();
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees.clear();
        this.employees.addAll(employees);
    }

    public boolean isEmptyEmployeesList() {
        return employees.isEmpty();
    }
}


