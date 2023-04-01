package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        print();
        settingUpListerners();

    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{
            int binary = Integer.parseInt(num.getText().toString());
            int decimal=0;int i=0;
            while (binary!=0){
                int reminder = binary%10;
                binary /=10;
                decimal += reminder*Math.pow(2,i);
                ++i;
            }
            res.setText("Decimal = "+decimal);
        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        btnc = findViewById(R.id.btnc);
        res = findViewById(R.id.res);
    }

}