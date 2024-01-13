package ru.gb.hw3.presenter;

import ru.gb.hw3.model.EmployeesService;
import ru.gb.hw3.view.View;

public class MainPresenter extends Presenter {

    private final EmployeesService srv;

    public MainPresenter(View view) {
        super(view);
        srv = new EmployeesService();
    }

    public void getEmployees() {
        view().print(srv.getEmployees());
    }

    public void setEmployees() {
        srv.setEmployees(EmployeesService.createTestEmployeesList());
    }

    public void raiseSalary(double increase) {
        view().print(srv.raiseSalary(increase));
    }

    public boolean isEmptyEmployeesList() {
        return srv.isEmptyEmployeesList();
    }
}