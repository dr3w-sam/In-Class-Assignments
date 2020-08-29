package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText grade_f = findViewById(R.id.finalgrade);

        Bundle bundle = getIntent().getExtras();

        grade = bundle.getInt("Grade", 0);

        if (grade > 90) {
            grade_f.setText("A");
        } else if (grade > 80 && grade < 90) {
            grade_f.setText("B");
        } else if (grade > 70 && grade < 80) {
            grade_f.setText("C");
        } else if (grade > 60 && grade < 70) {
            grade_f.setText("D");
        } else if (grade < 60) {
            grade_f.setText("F");
        }
        Button button = (Button) findViewById(R.id.home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(view.getContext(), MainActivity.class);
                startActivity(home);
            }
        });
    }
}
