package com.example.saleesh.simplecalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    EditText totalResult;
    int num1,numtemp;
    String s = "";
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
        s = "";
        num1 = 0;
        totalResult.setText("");

    }






    private void display(int i) {
        s = s+Integer.toString(i);
        totalResult.setText(s);
        num1 = Integer.valueOf(s).intValue();


    }


    private void perform() {
        s = "";
        numtemp = num1;

    }

    private void calculate() {

        if(op == '+')
            num1 = numtemp+num1;
        else if(op == '-')
            num1 = numtemp-num1;
        else if(op == '/')
            num1 = numtemp/num1;
        else if(op == '*')
            num1 = numtemp*num1;
        totalResult.setText(""+num1);
    }

   




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
