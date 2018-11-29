package com.lmao.gayyy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText no1, no2, result;
    private Button eq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }
    public void addListenerOnButton() {
        no1 = (EditText) findViewById(R.id.no1);
        no2 = (EditText) findViewById(R.id.no2);
        eq = (Button) findViewById(R.id.eq);

        eq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                String value1=no1.getText().toString();
                String value2=no2.getText().toString();
                int a=Integer.parseInt(value1);
                int b=Integer.parseInt(value2);
                int result=a+b;
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_LONG).show();
            }
        });
    }
}