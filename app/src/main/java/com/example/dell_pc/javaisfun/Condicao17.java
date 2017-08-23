package com.example.dell_pc.javaisfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Condicao17 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao17);
    }
}
