package com.example.smpn2tegal;

import android.content.Intent;
import android.os.Bundle;
import android.system.Os;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class ekskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.ekskul1,
            R.drawable.ekskul2,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void pramuka(View view) {
        Intent intent = new Intent(ekskulActivity.this, pramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(ekskulActivity.this, pmrActivity.class);
        startActivity(intent);
    }

    public void senitari(View view) {
        Intent intent = new Intent(ekskulActivity.this, SeniTariActivity.class);
        startActivity(intent);
    }

    public void karate(View view) {
        Intent intent = new Intent(ekskulActivity.this,karateActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(ekskulActivity.this,futsalActivity.class);
        startActivity(intent);
    }

    public void pbb(View view) {
        Intent intent = new Intent(ekskulActivity.this,pbbActivity.class);
        startActivity(intent);
    }

    public void basket(View view) {
        Intent intent = new Intent(ekskulActivity.this,basketActivity.class);
        startActivity(intent);
    }
}