package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Classe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe2);
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto5).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto6).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto7).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.INVISIBLE);
    }

    public void prox1(View view) {
        findViewById(R.id.texto1).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto2).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.VISIBLE);
    }

    public void prox2(View view) {
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto1).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);


    }

    public void prox3(View view) {
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto1).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.VISIBLE);

    }

    public void prox4(View view) {
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto1).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto5).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.VISIBLE);


    }

    public void prox5(View view) {
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto1).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto5).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto6).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.VISIBLE);


    }

    public void prox6(View view) {
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto1).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto5).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto6).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto7).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter6).setVisibility(View.VISIBLE);
        findViewById(R.id.proxbutt).setVisibility(View.VISIBLE);

    }

    public void ant1(View view) {
        findViewById(R.id.texto1).setVisibility(View.VISIBLE);
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter6).setVisibility(View.INVISIBLE);


    }

    public void ant2(View view) {
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto2).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter6).setVisibility(View.INVISIBLE);
    }

    public void ant3(View view) {
        findViewById(R.id.texto4).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
    }

    public void ant4(View view) {
        findViewById(R.id.texto5).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
    }

    public void ant5(View view) {
        findViewById(R.id.texto6).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto5).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
    }

    public void ant6(View view) {
        findViewById(R.id.texto7).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto6).setVisibility(View.VISIBLE);
        findViewById(R.id.tanter6).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter5).setVisibility(View.VISIBLE);
        findViewById(R.id.tprox5).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tprox).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter4).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter3).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter2).setVisibility(View.INVISIBLE);
        findViewById(R.id.tanter1).setVisibility(View.INVISIBLE);
    }
    public void next(View view){
        Intent intent = new Intent(this, Classe3.class);
        startActivity(intent);
    }

    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Classe2.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

}
