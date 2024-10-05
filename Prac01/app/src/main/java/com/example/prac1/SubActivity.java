package com.example.prac1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        edtName = findViewById(R.id.edt_name);
        edtGPA = findViewById(R.id.edt_num);
        Button buttonSubmit = findViewById(R.id.btn_sub);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String gpa = edtGPA.getText().toString();
                String result = "Họ và tên: " + name + "\nGPA: " + gpa;

                Intent returnIntent = new Intent();
                returnIntent.putExtra("resultKey", result);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
