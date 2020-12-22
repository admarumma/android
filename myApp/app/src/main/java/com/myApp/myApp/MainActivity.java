package com.myApp.myApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements TypeAdapter.OnClickType {

    RecyclerView recyclerView;
    Type[] types = new Type[4];
    TypeAdapter typeAdapter;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        typeAdapter = new TypeAdapter(setType(), this);
        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(typeAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked();
            }
        });
    }

    public Type[] setType(){
        types[0] = new Type("Маршрут");
        types[1] = new Type("Маршрут");
        types[2] = new Type("Маршрут");
        types[3] = new Type("Маршрут");
        return types;
    }

    @Override
    public void onclickType(int position) {
        Intent intent = new Intent(MainActivity.this, TypeInnerActivity.class);
        startActivity(intent);
    }

    public void clicked(){
        String hello = "Hello world";
        Intent send = new Intent();
        send.setAction(Intent.ACTION_SEND);
        send.putExtra(Intent.EXTRA_TEXT, hello);
        send.setType("text/plain");

        String tittle = "Go anywhere";
        Intent chooser = Intent.createChooser(send, tittle);
        if(send.resolveActivity(getPackageManager()) != null){
            startActivity(send);
        }
    }
}