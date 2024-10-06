package com.example.prac02;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class EmployeeViewModel extends ViewModel {
    private final MutableLiveData<List<Employee>> employees;

    public EmployeeViewModel() {
        employees = new MutableLiveData<>();
        loadEmployees(); // Giả lập tải dữ liệu
    }

    private void loadEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        // Thêm một số nhân viên mẫu
        employeeList.add(new Employee("001", "Nguyen Van A", "1990-01-01", 50000));
        employeeList.add(new Employee("002", "Tran Thi B", "1992-02-02", 60000));
        employeeList.add(new Employee("003", "Le Van C", "1989-03-03", 70000));
        employees.setValue(employeeList);
    }

    public LiveData<List<Employee>> getEmployees() {
        return employees;
    }

    public void addEmployee(String staffId, String fullName, String birthDate, double salary) {
        List<Employee> currentEmployees = employees.getValue();
        if (currentEmployees != null) {
            currentEmployees.add(new Employee(staffId, fullName, birthDate, salary));
            employees.setValue(currentEmployees); // Cập nhật danh sách
        }
    }
}