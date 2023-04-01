package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalToBinary extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_binary);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{
            int decimal = Integer.parseInt(num.getText().toString());
            int binary[] = new int[40];
            int index = 0;
            while(decimal > 0){
                binary[index++] = decimal%2;
                decimal = decimal/2;
            }
            res.setText("Binary = ");
            for(int i = index-1;i >= 0;i--){
                res.setText(binary[i]);
            }

        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        btnc = findViewById(R.id.btnc);
        res = findViewById(R.id.res);
    }

}
