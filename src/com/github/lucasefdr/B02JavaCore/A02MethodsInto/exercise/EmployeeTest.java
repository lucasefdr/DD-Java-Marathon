package com.github.lucasefdr.B02JavaCore.A02MethodsInto.exercise;

public class EmployeeTest {
    public static void main(String... args) {
        var employeeOne = new Employee();

        employeeOne.name = "Lucas";
        employeeOne.age = 24;
        //employeeOne.salaries = new Double[]{8000D, 3000D, 2800D};

        var employeeData = employeeOne.printData();
        var employeeSalaryAverage = employeeOne.salaryAverage();

        System.out.println(employeeData);
        System.out.println("Employee salary average: " + employeeSalaryAverage);
    }
}
