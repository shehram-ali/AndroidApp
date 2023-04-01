package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CentimeterToFeet extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.centimeter_to_feet);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{
            int centimeter = Integer.parseInt(num.getText().toString());
            double feet =centimeter*0.0328 ;

            res.setText("Feet = "+feet);


        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        btnc = findViewById(R.id.btnc);
        res = findViewById(R.id.res);
    }
}