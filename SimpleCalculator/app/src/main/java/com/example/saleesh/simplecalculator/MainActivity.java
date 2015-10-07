package com.example.saleesh.simplecalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    EditText totalResult;
    float num1,numtemp;
    String inputText = "";
    public String str ="";
    Character op = 'q';


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalResult = (EditText)findViewById(R.id.editText);
    }

    public void buttonzero(View v){
       display(0);

    }



    public  void buttonone(View v){
        display(1);

    }
    public void buttontwo(View v){
        display(2);

    }
    public void buttonthree(View v){
        display(3);

    }
    public void buttonfour(View v){
        display(4);

    }
    public void buttonfive(View v){
        display(5);

    }
    public void buttonsix(View v){
        display(6);

    }
    public void buttonseven(View v){
        display(7);

    }
    public void buttoneight(View v){
        display(8);

    }
    public void buttonnine(View v){
        display(9);

    }
    public void buttonplus(View v){
        perform();
        op = '+';
    }


    public void buttonminus(View v){
        perform();
        op = '-';
    }

    public void buttonmulti(View v){
        perform();
        op = '*';

    }
    public void buttondiv(View v){
        perform();
        op = '/';

    }
    public void buttonequal(View v){
        calculate();

    }


    public void buttonclear(View v){
        num1 = 0;
        totalResult.setText("");
    }






    private void display(int i) {
        inputText = inputText + Integer.toString(i);
        totalResult.setText(inputText);
        num1 = Integer.valueOf(inputText).intValue();
    }


    private void perform() {
        inputText = "";
        numtemp = num1;

    }

    private void calculate() {

        if(op == '+')
            num1 = numtemp + num1;
        else if(op == '-')
            num1 = numtemp - num1;
        else if(op == '/')
            num1 = numtemp / num1;
        else if(op == '*')
            num1 = numtemp * num1;
        totalResult.setText(""+num1);
    }




}
