package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText num,num1;
    TextView res;
    Button btnc,btnc1,btnc2,btnc3,btnc4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{
            int inp1 = Integer.parseInt(num.getText().toString());
            int inp2 = Integer.parseInt(num1.getText().toString());
            int out = inp1 + inp2;

            res.setText("Addition: "+out);


        });
        btnc1.setOnClickListener(view->{
            int inp1 = Integer.parseInt(num.getText().toString());
            int inp2 = Integer.parseInt(num1.getText().toString());
            int out = inp1 - inp2;

            res.setText("Subtraction: "+out);


        });
        btnc1.setOnClickListener(view->{
            int inp1 = Integer.parseInt(num.getText().toString());
            int inp2 = Integer.parseInt(num1.getText().toString());
            int out = inp1 - inp2;

            res.setText("Subtraction: "+out);


        });
        btnc2.setOnClickListener(view->{
            int inp1 = Integer.parseInt(num.getText().toString());
            int inp2 = Integer.parseInt(num1.getText().toString());
            int out = inp1 * inp2;

            res.setText("Multiplication: "+out);


        });
        btnc3.setOnClickListener(view->{
            int inp1 = Integer.parseInt(num.getText().toString());
            int inp2 = Integer.parseInt(num1.getText().toString());
            float out = inp1 / inp2;

            res.setText("Division: "+out);


        });
        btnc4.setOnClickListener(view->{
            int inp1 = Integer.parseInt(num.getText().toString());
            int inp2 = Integer.parseInt(num1.getText().toString());
            int out = inp1 % inp2;

            res.setText("Remainder: "+out);


        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        num1 = findViewById(R.id.num1);
        btnc = findViewById(R.id.btnc);
        btnc1 = findViewById(R.id.btnc1);
        btnc2= findViewById(R.id.btnc2);
        btnc3= findViewById(R.id.btnc3);
        btnc4 = findViewById(R.id.btnc4);
        res = findViewById(R.id.res);
    }
}