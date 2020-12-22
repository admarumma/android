package com.myapp.film;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    Content[] contents;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contents = new Content[10];
        recyclerView = findViewById(R.id.recyclerView);
        this.returnContent();
        adapter = new FilmsAdapter(contents);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void returnContent(){
        contents[0] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[1] = new Content("Spider Man", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[2] = new Content("Thor", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[3] = new Content("Avengers", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[4] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[5] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[6] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[7] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[8] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
        contents[9] = new Content("AquaMan", "https://anor.tj/assets/images/thumbnails/16059858168PWJYmtq.jpg");
    }
}