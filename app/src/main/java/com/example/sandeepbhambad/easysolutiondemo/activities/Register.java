package com.example.sandeepbhambad.easysolutiondemo.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.sandeepbhambad.easysolutiondemo.R;
import com.example.sandeepbhambad.easysolutiondemo.adapters.IntroAdapter;

public class Register extends FragmentActivity {

    ViewPager viewPager;
    ImageView inroIndicatior1;
    ImageView inroIndicatior2;
    ImageView inroIndicatior3;
    ImageView inroIndicatior4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        viewPager = (ViewPager) findViewById(R.id.introPager);
        IntroAdapter padapter = new IntroAdapter(getSupportFragmentManager());
        viewPager.setAdapter(padapter);

        inroIndicatior1 = (ImageView) findViewById(R.id.inroIndicatior1);
        inroIndicatior2 = (ImageView) findViewById(R.id.inroIndicatior2);
        inroIndicatior3 = (ImageView) findViewById(R.id.inroIndicatior3);
        inroIndicatior4 = (ImageView) findViewById(R.id.inroIndicatior4);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                if(i==0){
                    inroIndicatior1.setImageResource(R.drawable.solid_circle);
                    inroIndicatior2.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior3.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior4.setImageResource(R.drawable.hollow_circle);
                } else if(i==1){
                    inroIndicatior1.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior2.setImageResource(R.drawable.solid_circle);
                    inroIndicatior3.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior4.setImageResource(R.drawable.hollow_circle);
                } else if(i==2){
                    inroIndicatior1.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior2.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior3.setImageResource(R.drawable.solid_circle);
                    inroIndicatior4.setImageResource(R.drawable.hollow_circle);
                } else if(i==3){
                    inroIndicatior1.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior2.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior3.setImageResource(R.drawable.hollow_circle);
                    inroIndicatior4.setImageResource(R.drawable.solid_circle);
                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

}
