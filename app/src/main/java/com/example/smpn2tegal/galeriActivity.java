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
        Intent intent = new Intent(galeriActivity.this, adiwiyata.class);
        startActivity(intent);
    }

    public void literasi(View view) {
        Intent intent = new Intent(galeriActivity.this, literasi.class);
        startActivity(intent);
    }

    public void prestasisekolah(View view) {
        Intent intent = new Intent(galeriActivity.this, prestasi.class);
        startActivity(intent);
    }

    public void sosial(View view) {
        Intent intent = new Intent(galeriActivity.this, kegiatansosial.class);
        startActivity(intent);
    }

    public void keagamaan(View view) {
        Intent intent = new Intent(galeriActivity.this, keagamaan.class);
        startActivity(intent);
    }
}