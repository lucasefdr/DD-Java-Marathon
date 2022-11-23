package edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain;

public class Employee {
    private String name;
    private Integer age;
    private Double[] salaries = new Double[3];
    private Double average = 0D;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(Double[] salaries) {
        this.salaries = salaries;
    }

    public Double getAverage() {
        if (salaries == null) return 0D;

        for (Double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
        return average;
    }
}
