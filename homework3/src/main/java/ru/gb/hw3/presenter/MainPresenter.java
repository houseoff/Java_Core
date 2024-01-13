package ru.gb.hw3.presenter;

import ru.gb.hw3.model.EmployeesService;
import ru.gb.hw3.view.View;

public class MainPresenter extends Presenter {

    private final EmployeesService svc;

    public MainPresenter(View view) {
        super(view);
        svc = new EmployeesService();
    }

    public void getEmployees() {
        view().print(svc.getEmployees());
    }

    public void setEmployees() {
        svc.setEmployees(EmployeesService.createTestEmployeesList());
    }

    public void raiseSalary(double increase) {
        view().print(svc.raiseSalary(increase));
    }

    public boolean isEmptyEmployeesList() {
        return svc.isEmptyEmployeesList();
    }

    public void sortByAge() {
        svc.sortByAge();
        this.getEmployees();
    }

    public void sortById() {
        svc.sortById();
        this.getEmployees();
    }

    public void sortByPost() {
        svc.sortByPost();
        this.getEmployees();
    }

    public void sortBySalary() {
        svc.sortBySalary();
        this.getEmployees();
    }

    public void sortByName() {
        svc.sortByName();
        this.getEmployees();
    }

    public void filterBySalaryDesc(double salary) {
        view().print(svc.getFilteredBySalaryDesc(salary));
    }
}