package com.example.dell_pc.javaisfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Operadores7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadores7);
        findViewById(R.id.imageButton36).setVisibility(View.GONE);
        findViewById(R.id.textErrado).setVisibility(View.GONE);
        findViewById(R.id.textCorreto).setVisibility(View.GONE);
        findViewById(R.id.maIgual).setVisibility(View.GONE);
    }

    public void correto(View view){
        findViewById(R.id.imageButton36).setVisibility(View.VISIBLE);
        findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
        findViewById(R.id.maIgual).setVisibility(View.GONE);
        findViewById(R.id.textErrado).setVisibility(View.GONE);
    }
    public void errado(View view){
        findViewById(R.id.textCorreto).setVisibility(View.GONE);
        findViewById(R.id.imageButton36).setVisibility(View.VISIBLE);
        findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
        findViewById(R.id.maIgual).setVisibility(View.VISIBLE);
    }
}
