package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Condicao13 extends AppCompatActivity {
    private Button verificar;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao13);
        findViewById(R.id.enunciadoErrado).setVisibility(View.GONE);
        findViewById(R.id.textCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.wink).setVisibility(View.INVISIBLE);
        findViewById(R.id.sad).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton3).setVisibility(View.INVISIBLE);
        findViewById(R.id.textErrado).setVisibility(View.INVISIBLE);
    }

    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Condicao13.this, MainActivity.class);
                        startActivity(intent);
                        finishAffinity();
                        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
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


    public void next(View view) {
        Intent intent = new Intent(this, Condicao14.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }


    public void verifCorreto(View view) {

        findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
        findViewById(R.id.wink).setVisibility(View.VISIBLE);
        findViewById(R.id.Enunciado).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado3).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado2).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado1).setVisibility(View.GONE);
        findViewById(R.id.buttonCorreto).setVisibility(View.GONE);
        findViewById(R.id.textView349).setVisibility(View.GONE);
        findViewById(R.id.imageButton3).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView28).setVisibility(View.GONE);
        findViewById(R.id.textView277).setVisibility(View.GONE);
    }

    public void verifErrado(View view) {



        findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
        findViewById(R.id.imageButton3).setVisibility(View.VISIBLE);
        findViewById(R.id.Enunciado).setVisibility(View.GONE);
        findViewById(R.id.textView277).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado3).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado2).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado1).setVisibility(View.GONE);
        findViewById(R.id.buttonCorreto).setVisibility(View.GONE);
        findViewById(R.id.textView349).setVisibility(View.GONE);
        findViewById(R.id.imageView28).setVisibility(View.GONE);
        findViewById(R.id.enunciadoErrado).setVisibility(View.VISIBLE);
        findViewById(R.id.sad).setVisibility(View.VISIBLE);
    }


}

