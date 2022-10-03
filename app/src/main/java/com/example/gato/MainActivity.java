package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnComenzar;

        btnComenzar = findViewById(R.id.btnComenzar);
        btnComenzar.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
    }
}