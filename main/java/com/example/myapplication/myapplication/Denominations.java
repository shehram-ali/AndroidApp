package com.example.myapplication.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Denominations extends AppCompatActivity {
    EditText num;
    TextView res;
    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denominations);
        initComponents();
        print();
        settingUpListerners();
    }
    private void print() {

    }

    private void settingUpListerners() {
        btnc.setOnClickListener(view->{

            int amt=Integer.parseInt(num.getText().toString());
            int r100 = 0, r50 = 0, r10 = 0, r1 = 0, count = 0;


            while (amt >= 100) {
                r100 = amt / 100;
                amt = amt % 100;
                System.out.print("\nTotal Number Of 100 Rupees Notes : " + r100);
                break;
            }

            while (amt >= 50) {
                r50 = amt / 50;
                amt = amt % 50;
                System.out.print("\nTotal Number Of 50 Rupees Notes : " + r50);
                break;
            }

            while (amt >= 10) {
                r10 = amt / 10;
                amt = amt % 10;
                System.out.print("\nTotal Number Of 10 Rupees Notes Or Coin : " + r10);
                break;
            }

            while (amt >= 1) {
                r1 = amt / 1;
                amt = amt % 1;
                System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : " + r1);
                break;
            }

            count = r100 + r50+ r10 + r1;
            System.out.print("\n\nTotal Number Of Notes Require : \n\n" + count);



        });
    }

    private void initComponents() {
        num = findViewById(R.id.num);
        btnc = findViewById(R.id.btnc);
        res = findViewById(R.id.res);
    }
}