package com.example.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Calculos10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos10);
    }
    public void homeBasic(View view){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);
    }
    public void nextexercise(View view){
        Intent intent = new Intent(this, Condicao.class);
        startActivity(intent);
    }
}
