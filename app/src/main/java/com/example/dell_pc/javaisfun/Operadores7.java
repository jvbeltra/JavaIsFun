package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Operadores7 extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
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
        findViewById(R.id.imageButton39).setVisibility(View.GONE);
        findViewById(R.id.imageButton41).setVisibility(View.GONE);
        findViewById(R.id.imageButton42).setVisibility(View.GONE);
        findViewById(R.id.imageButton43).setVisibility(View.GONE);
        findViewById(R.id.imageButton44).setVisibility(View.GONE);
        findViewById(R.id.imageButton45).setVisibility(View.GONE);


    }
    public void errado(View view){
        findViewById(R.id.textCorreto).setVisibility(View.GONE);
        findViewById(R.id.imageButton36).setVisibility(View.VISIBLE);
        findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
        findViewById(R.id.maIgual).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton39).setVisibility(View.GONE);
        findViewById(R.id.imageButton41).setVisibility(View.GONE);
        findViewById(R.id.imageButton42).setVisibility(View.GONE);
        findViewById(R.id.imageButton43).setVisibility(View.GONE);
        findViewById(R.id.imageButton44).setVisibility(View.GONE);
        findViewById(R.id.imageButton45).setVisibility(View.GONE);

    }

    public void next(View view){
        Intent intent = new Intent(this, Operadores8.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);

    }

    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Operadores7.this, MainActivity.class);
                        startActivity(intent);
                        finishAffinity();
                        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setIcon(R.drawable.warning)
                .show();

    }
}
