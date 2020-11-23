package com.example.secondandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {

    int random;
    int tried = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        Button btn = (Button) findViewById(R.id.btn);
//        btn.setOnClickListener(new Button.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                counter++;
//                TextView txt = (TextView) findViewById(R.id.txt);
//                txt.setText(v.getContentDescription());
//            }
//        });
        TextView txt = (TextView) findViewById(R.id.txt);
        Random random = new Random();
        this.random = random.nextInt(9);
        txt.setText("Вы можете начать игру! Выберите число");
    }

    public void onBtn(View v){
        TextView txt = (TextView) findViewById(R.id.txt);
        if(this.tried <= 5){
            if(this.random == Integer.parseInt((String) v.getContentDescription())){
                this.tried = 0;
                Random random = new Random();
                this.random = random.nextInt(9);
                txt.setText("Вы вииграли. Вы можете начать игру! Выберите число");
            }else{
                tried++;
                if(this.random < Integer.parseInt((String) v.getContentDescription())){
                    txt.setText("Вниз");
                }else{
                    txt.setText("Вверх");
                }
            }
        }else{
            Random random = new Random();
            this.random = random.nextInt(9);
            txt.setText("Вы проиграли. Вы можете начать игру! Выберите число");
            this.tried = 0;
        }
    }
}