package com.example.dell_pc.javaisfun;

import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void TelaBasica(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
    }
    public void TelaIntermediaria(View view){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);
    }
    public void TelaAvancada(View view){
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
    }
    public void AboutTheApp(View view){
        Intent intent = new Intent(this, AboutTheApp.class);
        startActivity(intent);
    }
    public void AboutUs(View view){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
    public void Modelo1(View view){
        Intent intent = new Intent(this, Modelo1.class);
        startActivity(intent);
    }

}
