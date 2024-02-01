package com.example.m4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button one, two, three,four,five,six,seven,eight,nine,zero;
    Button plus,minus,divide,mul,equls,clear;
    EditText res;
    String operatorpassed =" ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one= findViewById(R.id.one);
        two= findViewById(R.id.two);
        three= findViewById(R.id.three);
        four= findViewById(R.id.four);
        five= findViewById(R.id.five);
        six= findViewById(R.id.six);
        zero= findViewById(R.id.zero);
        seven= findViewById(R.id.seven);
        eight= findViewById(R.id.eight);
        nine= findViewById(R.id.nine);

        plus= findViewById(R.id.add);
        minus= findViewById(R.id.sub);
        mul= findViewById(R.id.mul);
        divide= findViewById(R.id.div);
        clear= findViewById(R.id.clear);
        equls= findViewById(R.id.equals);

        res= findViewById(R.id.res);

        one.setOnClickListener((View.OnClickListener) this);
        two.setOnClickListener((View.OnClickListener) this);
        three.setOnClickListener((View.OnClickListener) this);
        four.setOnClickListener((View.OnClickListener) this);
        five.setOnClickListener((View.OnClickListener) this);
        six.setOnClickListener((View.OnClickListener) this);
        seven.setOnClickListener((View.OnClickListener) this);
        eight.setOnClickListener((View.OnClickListener) this);
        nine.setOnClickListener((View.OnClickListener) this);
        zero.setOnClickListener((View.OnClickListener) this);

        plus.setOnClickListener( this);
        minus.setOnClickListener((View.OnClickListener) this);
        mul.setOnClickListener((View.OnClickListener) this);
        divide.setOnClickListener((View.OnClickListener) this);
        clear.setOnClickListener((View.OnClickListener) this);
        equls.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View view) {
        double finalres = 0.0;
        int vid = view.getId();

        if (R.id.one == vid) {
            res.append("1");
        } else if (vid == R.id.two) {
            res.append("2");
        } else if (vid == R.id.three) {
            res.append("3");
        } else if (vid == R.id.four) {
            res.append("4");
        } else if (vid == R.id.five) {
            res.append("5");
        } else if (vid == R.id.six) {
            res.append("6");
        } else if (vid == R.id.seven) {
            res.append("7");
        } else if (vid == R.id.eight) {
            res.append("8");
        } else if (vid == R.id.nine) {
            res.append("9");
        } else if (vid == R.id.zero) {
            res.append("0");
        } else if (vid == R.id.add) {
            res.append("+");
            operatorpassed = "+";
        } else if (vid == R.id.sub) {
            res.append("-");
            operatorpassed = "-";
        } else if (vid == R.id.mul) {
            res.append("*");
            operatorpassed = "*";

        } else if (vid == R.id.div) {
            res.append("/");
            operatorpassed = "/";

        } else if (vid == R.id.clear) {
            res.setText(" ");
        } else if (vid == R.id.equals) {
            finalres = evaluateExpression(res.getText().toString(), operatorpassed);
            res.setText(String.valueOf(finalres));

        } else {
            return;
        }
    }
        private double evaluateExpression(String res,String operatorpassed){
            String token[]=res.split("\\+|-|\\*|\\/");
            double first=Double.parseDouble(token[0]);
            double second=Double.parseDouble(token[1]);
            switch(operatorpassed){
                case "+" :return first +second;
                case "-" :return first - second;
                case "*" :return first * second;
                case "/" :return first  / second;
                default:return 0;
            }
        }



}