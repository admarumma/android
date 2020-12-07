package com.ilmhona.contacs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    TextView name;
    TextView email;
    TextView phone;
    TextView toolbarName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_activity);

        name = findViewById(R.id.textName);
        phone = findViewById(R.id.email);
        email = findViewById(R.id.phone);
        toolbarName = findViewById(R.id.toolbarName);

        toolbarName.setText(getIntent().getStringExtra("name"));
        name.setText(getIntent().getStringExtra("name") + " " + getIntent().getStringExtra("lastName"));
        phone.setText(String.valueOf(getIntent().getIntExtra("phone", 1)));
        email.setText(getIntent().getStringExtra("email"));
    }
}
