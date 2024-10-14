package com.example.ex01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtKQ;
    Button btncong;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA); edtB = findViewById(R.id.edtB); edtKQ = findViewById(R.id.edtKQ);
        btncong = findViewById(R.id.btntong);
        btncong.setOnClickListener(new View.OnClickListener() {@Override
        public void onClick(View view) {
            int a = Integer.parseInt(edtA.getText().toString());
            int b = Integer.parseInt(edtB.getText().toString());
            int c = a + b;
            edtKQ.setText(c + " ");
        }
        });
    }
}
