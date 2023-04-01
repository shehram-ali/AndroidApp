package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FahrenheitToCelsius2 extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius2);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{
            int Fahrenheit = Integer.parseInt(num.getText().toString());
            double celsius = ((Fahrenheit-32)*5)/9;

            res.setText("Celsius = "+celsius+" C");


        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        btnc = findViewById(R.id.btnc);
        res = findViewById(R.id.res);
    }

}