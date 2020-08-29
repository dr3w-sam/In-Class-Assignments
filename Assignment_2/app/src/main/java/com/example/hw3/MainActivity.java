package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    int x;
    int grade;
    EditText T_1, T_2;
    private Button button_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_calc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText T_1 = findViewById(R.id.T_1);
                EditText T_2 = findViewById(R.id.T_2);

                String a = T_1.getText().toString();
                String b = T_2.getText().toString();

                int t1 = Integer.parseInt(a);
                int t2 = Integer.parseInt(b);

                switch (x)
                {
                    case 0:
                        Toast.makeText(getApplicationContext(), "ERROR! Student Type not selected",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        grade = (int) ((t1 * .3) + (t2 * .7)); //Undergraduate Calculation
                        break;
                    case 2:
                        grade = (int) ((t1 * .5) + (t2 * .5)); //Graduate Calculation
                        break;
                }

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("Grade", grade);
                startActivity(intent);

                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
                rg.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {

                        RadioGroup r = (RadioGroup) findViewById((R.id.radioGroup));
                        int selectedId = r.getCheckedRadioButtonId();

                        if (selectedId == R.id.op1) {
                            x = 1; //Undergraduate
                        }
                        else if (selectedId == R.id.op2)
                        {
                            x = 2; //Graduate
                        }
                    }
                });
            }
        });

    }
}