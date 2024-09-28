package org.example.javattd28.salesdepartment;

import org.example.javattd28.employe.Employee;

import java.util.List;

public class Salesdepartment {
    private String departmentName;
    private List<Employee> employees;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
