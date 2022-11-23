package edu.lucas.marathon.B02JavaCore.A02MethodsInto.test;

import edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Lucas");
        employee.setAge(24);
        employee.setSalaries(new Double[]{2000D, 4900D, 5000D});

        System.out.println("Employee average: R$" + employee.getAverage());
    }
}
