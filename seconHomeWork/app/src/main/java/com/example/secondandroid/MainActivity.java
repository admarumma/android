package com.example.secondandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.add);
        Button reduce = (Button) findViewById(R.id.reduce);
        Button zero = (Button) findViewById(R.id.zero);

        add.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter++;
                TextView txt = (TextView) findViewById(R.id.txt);
                txt.setText(Integer.toString(counter));
            }
        });

        reduce.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter--;
                TextView txt = (TextView) findViewById(R.id.txt);
                txt.setText(Integer.toString(counter));
            }
        });

        zero.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter = 0;
                TextView txt = (TextView) findViewById(R.id.txt);
                txt.setText(Integer.toString(counter));
            }
        });
    }
}