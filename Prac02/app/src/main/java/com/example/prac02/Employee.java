package com.example.prac02;

public class Employee {
    private String staffId;
    private String fullName;
    private String birthDate;
    private double salary;

    // Constructor
    public Employee(String staffId, String fullName, String birthDate, double salary) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    // Getters
    public String getStaffId() {
        return staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }
}
