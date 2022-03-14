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

    public void albumhutri(View view) {
        Intent intent = new Intent(galeriActivity.this, albumhutriActivity.class);
        startActivity(intent);
    }

    public void albumpramuka(View view) {
        Intent intent = new Intent(galeriActivity.this, albumpmrActivity.class);
        startActivity(intent);
    }

    public void albumpmr(View view) {
        Intent intent = new Intent(galeriActivity.this, albumpramukaActivity.class);
        startActivity(intent);
    }
}