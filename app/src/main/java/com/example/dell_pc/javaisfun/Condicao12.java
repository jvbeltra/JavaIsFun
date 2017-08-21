package com.example.dell_pc.javaisfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Condicao12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao12);
        findViewById(R.id.buttSem).setVisibility(View.INVISIBLE);
        findViewById(R.id.com).setVisibility(View.INVISIBLE);

    }
    public void proxcom(View view){
        findViewById(R.id.buttSem).setVisibility(View.VISIBLE);
        findViewById(R.id.com).setVisibility(View.VISIBLE);
        findViewById(R.id.buttCom).setVisibility(View.GONE);
        findViewById(R.id.sem).setVisibility(View.GONE);

    }
    public void antsem(View view){
        findViewById(R.id.buttSem).setVisibility(View.INVISIBLE);
        findViewById(R.id.sem).setVisibility(View.VISIBLE);
        findViewById(R.id.buttCom).setVisibility(View.VISIBLE);
        findViewById(R.id.sem).setVisibility(View.VISIBLE);
        findViewById(R.id.com).setVisibility(View.GONE);

    }

}
