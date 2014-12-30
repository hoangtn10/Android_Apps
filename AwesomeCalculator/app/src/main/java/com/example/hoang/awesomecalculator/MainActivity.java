package com.example.hoang.awesomecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Button num1button, num2button, num3button, add, equal;
    private TextView answer;

    private int firstInteger, secondInteger;

    private boolean opClicked;

    private int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1button = (Button) findViewById(R.id.num1button);
        num2button = (Button) findViewById(R.id.num2button);
        num3button = (Button) findViewById(R.id.num3button);
        add = (Button) findViewById(R.id.add);
        equal = (Button) findViewById(R.id.equal);
        answer = (TextView) findViewById(R.id.answer);
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

    public void onNum1Click(View view) {
        answer.setText("1");
        if(!opClicked) {
            firstInteger = 1;
        }
        else {
            secondInteger = 1;
        }
    }

    public void onNum2Click(View view) {
        answer.setText("2");
        if(!opClicked) {
            firstInteger = 2;
        }
        else {
            secondInteger = 2;
        }
    }

    public void onNum3Click(View view) {
        answer.setText("3");
        if(!opClicked) {
            firstInteger = 3;
        }
        else {
            secondInteger = 3;
        }
    }

    public void onEqualClick(View view) {
        answer.setText(Integer.toString(firstInteger + secondInteger));
        opClicked = false;
    }

    public void onAddClick(View view) {
        opClicked = true;
        op = 1;
    }

    public void onNum0Click(View view) {
    }
}
