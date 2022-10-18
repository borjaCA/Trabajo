package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    Button botonnav = (Button) findViewById(R.id.buttonNavegador);
    botonnav.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/")));
        }

    });
        Button botonAtras = (Button) findViewById(R.id.buttonAtras);
        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }
}