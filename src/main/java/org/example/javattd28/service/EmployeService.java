package org.example.javattd28.service;

import org.example.javattd28.employe.Employee;
import org.example.javattd28.salesdepartment.Salesdepartment;

import java.util.Arrays;

public class EmployeService {
    public static void main(String[] args) {

        Salesdepartment salesDepartment = new Salesdepartment();
        salesDepartment.setDepartmentName("Neoteric ");


        Employee employee1 = new Employee();
        employee1.setId(101548);
        employee1.setName("Nani");
        employee1.setSalary("4000000");
        employee1.setDepartment("HR");

        Employee employee2 = new Employee();
        employee2.setId(254578);
        employee2.setName("Mahesh");
        employee2.setSalary("200000");
        employee2.setDepartment("Sales Department");

        salesDepartment.setEmployees(Arrays.asList(employee1, employee2));
//        ArrayList<Employee> refername =new ArrayList();
//        refername.add(employee1);
//        refername.add(employee2);
//        salesDepartment.setEmployees(refername);

        System.out.println("Sales Department:");
        System.out.println("Department Name: " + salesDepartment.getDepartmentName()+salesDepartment);
        System.out.println("Employees:");
        System.out.println("salary:");


        for (Employee employee : salesDepartment.getEmployees()) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
        }
    }
}
