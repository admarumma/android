package com.ilmhona.contacs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ilmhona.contacs.AddContactActivity;
import com.ilmhona.contacs.Contact;
import com.ilmhona.contacs.ContactAdapter;
import com.ilmhona.contacs.R;

public class MainActivity extends AppCompatActivity implements ContactAdapter.OnItemClickListener {

    FloatingActionButton fab;
    RecyclerView recyclerView;
    ContactAdapter adapter;
    Contact[] contacts = new Contact[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddContactActivity.class);
                startActivity(intent);
            }
        });

        // Заполняем массив
        setContactsArray();

        // Инициализируем recyclerView список
        initRecyclerView();
    }

    private void setContactsArray() {
        contacts[0] = new Contact( "Islom", "Nuridinov", "simpleemail@gmail.com",  919506017);
        contacts[1] = new Contact( "Alex", "Cold","alexcold@gmail.com",919519919);
        contacts[2] = new Contact( "Diana", "Sparrow","dianasparrow@gmail.com",880008819);
        contacts[3] = new Contact( "Dean", "Winchester","deanwin@gmail.com",00011100);
        contacts[4] = new Contact( "Sam", "Winchester","samwin@gmail.com",221222111);
        contacts[5] = new Contact( "Erric", "Banas","errirbanas@gmail.com",987787878);
        contacts[7] = new Contact("Aiden", "Pierce","aidenpie@gmail.com",999999999);
        contacts[6] = new Contact( "Dominic", "Torretto","domtorreto@gmail.com",888888888);
        contacts[8] = new Contact( "Elliot", "Alderson","elliotald@gmail.com",123322324);
        contacts[9] = new Contact( "Michel", "Rodriges","racrod@gmail.com",90000000);
        contacts[10] = new Contact("Rachel", "Wood","racwood@gmail.com",901901901);
        contacts[11] = new Contact("Eleonora", "Dean","eleoradean@gmail.com",987654321);
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        adapter = new ContactAdapter(contacts, this);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, ContactActivity.class);
        intent.putExtra("name", contacts[position].getName());
        intent.putExtra("lastName", contacts[position].getLastName());
        intent.putExtra("email", contacts[position].getEmail());
        intent.putExtra("phone", contacts[position].getPhoneNumber());
        startActivity(intent);
    }
}