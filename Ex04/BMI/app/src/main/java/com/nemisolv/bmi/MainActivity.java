package com.nemisolv.bmi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnBmi;
    EditText editName, editHeight, editWeight;
    EditText editDiagnosis;
    EditText editBMI;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnBmi = findViewById(R.id.btnBmi);
        editName = findViewById(R.id.editTextName);
        editHeight = findViewById(R.id.editTextHeight);
        editWeight = findViewById(R.id.editTextWeight);
        editDiagnosis = findViewById(R.id.editTextDiagnosis);
        editBMI = findViewById(R.id.editTextBMI);

        });


    }
}