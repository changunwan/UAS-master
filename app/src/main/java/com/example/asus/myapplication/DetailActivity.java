package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.asus.myapplication.R.layout.activity_detail);

        ResepDetailFragment frag =(ResepDetailFragment) getSupportFragmentManager().findFragmentById(com.example.asus.myapplication.R.id.detail_frag);
        Bundle yoga= getIntent().getExtras();

        frag.setResep(yoga.getLong("id"));
    }
}
