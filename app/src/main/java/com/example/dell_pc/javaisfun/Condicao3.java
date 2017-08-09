package com.example.dell_pc.javaisfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Condicao3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao3);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

}
