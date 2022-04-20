package com.example.smpn2tegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class galeriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void adiwiyata(View view) {
        Intent intent = new Intent(galeriActivity.this, AdiwiyataActivity.class);
        startActivity(intent);
    }

    public void literasi(View view) {
        Intent intent = new Intent(galeriActivity.this, literasiActivity.class);
        startActivity(intent);
    }

    public void prestasisekolah(View view) {
        Intent intent = new Intent(galeriActivity.this, prestasiActivity.class);
        startActivity(intent);
    }

    public void sosial(View view) {
        Intent intent = new Intent(galeriActivity.this, sosialActivity.class);
        startActivity(intent);
    }

    public void karnaval(View view) {
        Intent intent = new Intent(galeriActivity.this, karnavalActivity.class);
        startActivity(intent);
    }
}