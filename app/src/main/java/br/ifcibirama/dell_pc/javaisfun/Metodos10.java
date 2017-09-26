package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Metodos10 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos10);
        setTitle("Métodos");

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();

    }
    public void homeBasic(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();
    }
    public void nextexercise(View view){
        Intent intent = new Intent(this, Modificadores.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finishAffinity();
    }


}
