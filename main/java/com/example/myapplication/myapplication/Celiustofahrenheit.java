package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Celiustofahrenheit extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celius_to_fahrenheit);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{
            int celsius = Integer.parseInt(num.getText().toString());
            double fahreinheit = ((celsius*9)/5)+32;

            res.setText("Fahreinheit = "+fahreinheit);


        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        btnc = findViewById(R.id.btnc);
        res = findViewById(R.id.res);
    }
}