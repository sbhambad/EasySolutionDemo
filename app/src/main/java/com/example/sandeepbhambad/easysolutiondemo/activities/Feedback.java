package com.example.sandeepbhambad.easysolutiondemo.activities;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.sandeepbhambad.easysolutiondemo.R;

public class Feedback extends ActionBarActivity {

    private Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        mtoolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mtoolbar);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }




}
