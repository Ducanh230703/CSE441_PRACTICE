package com.example.prac02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EmployeeViewModel employeeViewModel;
    private TextView textView;
    private EditText editTextStaffId;
    private EditText editTextFullName;
    private EditText editTextBirthDate;
    private EditText editTextSalary;
    private Button buttonAddEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editTextStaffId = findViewById(R.id.editTextStaffId);
        editTextFullName = findViewById(R.id.editTextFullName);
        editTextBirthDate = findViewById(R.id.editTextBirthDate);
        editTextSalary = findViewById(R.id.editTextSalary);
        buttonAddEmployee = findViewById(R.id.buttonAddEmployee);

        employeeViewModel = new ViewModelProvider(this).get(EmployeeViewModel.class);

        // Quan sát dữ liệu
        employeeViewModel.getEmployees().observe(this, new Observer<List<Employee>>() {
            @Override
            public void onChanged(List<Employee> employees) {
                // Cập nhật giao diện người dùng
                StringBuilder sb = new StringBuilder();
                for (Employee employee : employees) {
                    sb.append("ID: ").append(employee.getStaffId()).append("\n")
                            .append("Name: ").append(employee.getFullName()).append("\n")
                            .append("Birth Date: ").append(employee.getBirthDate()).append("\n")
                            .append("Salary: ").append(employee.getSalary()).append("\n\n");
                }
                textView.setText(sb.toString());
            }
        });

        // Thêm sự kiện cho nút
        buttonAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String staffId = editTextStaffId.getText().toString();
                String fullName = editTextFullName.getText().toString();
                String birthDate = editTextBirthDate.getText().toString();
                double salary = Double.parseDouble(editTextSalary.getText().toString());

                employeeViewModel.addEmployee(staffId, fullName, birthDate, salary);

                // Xóa nội dung nhập
                editTextStaffId.setText("");
                editTextFullName.setText("");
                editTextBirthDate.setText("");
                editTextSalary.setText("");
            }
        });
    }
}