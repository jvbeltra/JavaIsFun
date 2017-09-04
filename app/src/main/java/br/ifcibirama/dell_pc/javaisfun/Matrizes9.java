package br.ifcibirama.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Matrizes9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrizes9);
    }
    public void homeBasic(View view){
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }
    public void nextexercise(View view){
        Intent intent = new Intent(this, Objetos.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finishAffinity();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();

    }
}
