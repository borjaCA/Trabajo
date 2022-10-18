package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pag1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pag1);
        Button botonCONT = (Button) findViewById(R.id.button4);
        botonCONT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/")));
            }

        });
        Button botonAtr = (Button) findViewById(R.id.button3);
        botonAtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Pag1Activity.this, MainActivity.class);

                startActivity(intent1);

            }
        });
        Button botonPag2 = (Button) findViewById(R.id.button5);
        botonPag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Pag1Activity.this, Pag2Activity.class);
                startActivity(intent2);
            }
        });
    }
}