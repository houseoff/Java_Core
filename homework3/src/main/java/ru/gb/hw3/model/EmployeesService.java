package ru.gb.hw3.model;

import ru.gb.hw3.model.comporator.*;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeesService {
    public static ArrayList<Employee> createTestEmployeesList() {
        var list = new ArrayList<Employee>();
        list.add(new Employee(1, "John", "Engineer", "11111111111", 55_000, 20));
        list.add(new Employee(2, "Ben", "HR", "22222222222", 50_000, 25));
        list.add(new Employee(3, "Mark", "Java Developer", "33333333333", 45_000, 30));
        list.add(new Employee(4,"Tim", "DevOps", "44444444444", 100_000, 35));
        list.add(new Head(5, "Bryce", "Head", "55555555555", 200_000, 40));
        return list;
    }

    private final ArrayList<Employee> employees;

    private String getEmployees(Collection<Employee> c) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (var e : c) {
            counter++;
            sb.append(e);
            if (counter != c.size()) sb.append("\n");
        }
        return sb.toString();
    }

    private Collection<Employee> filterBySalaryDesc(double salary) {
        return employees.stream()
                .filter(e -> e.salary < salary)
                .sorted(new EmployeeComparatorBySalaryDesc())
                .toList();
    }

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
        return getEmployees(employees);
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees.clear();
        this.employees.addAll(employees);
    }

    public boolean isEmptyEmployeesList() {
        return employees.isEmpty();
    }

    public void sortByAge() {
        employees.sort(new EmployeeComparatorByAge());
    }

    public void sortById() {
        employees.sort(new EmployeeComparatorByID());
    }

    public void sortByName() {
        employees.sort(new EmployeeComparatorByName());
    }

    public void sortByPost() {
        employees.sort(new EmployeeComparatorByPost());
    }

    public void sortBySalary() {
        employees.sort(new EmployeeComparatorBySalary());
    }

    public String getFilteredBySalaryDesc(double salary) {
        return getEmployees(filterBySalaryDesc(salary));
    }
}


