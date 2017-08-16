package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Condicao7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao7);
        findViewById(R.id.voltar).setVisibility(View.INVISIBLE);
        findViewById(R.id.proximo).setVisibility(View.INVISIBLE);
        findViewById(R.id.exp2  ).setVisibility(View.INVISIBLE);
        findViewById(R.id.exp3).setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

    }

    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Condicao7.this, MainActivity.class);
                        startActivity(intent);
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

    public void proximo(View view) {
        Intent intent = new Intent(this, Condicao8.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void avancarTxt(View view) {
        ImageView imageView44 = (ImageView) findViewById(R.id.imageView44);
        TextView exp2 = (TextView) findViewById(R.id.exp2);
        if(imageView44.getVisibility()==View.VISIBLE) {
            findViewById(R.id.voltar).setVisibility(View.VISIBLE);
            findViewById(R.id.proximo).setVisibility(View.GONE);
            findViewById(R.id.exp2).setVisibility(View.VISIBLE);
            findViewById(R.id.avancar).setVisibility(View.VISIBLE);
            findViewById(R.id.imageView44).setVisibility(View.GONE);
        }else
        if (exp2.getVisibility() == View.VISIBLE) {
            findViewById(R.id.voltar).setVisibility(View.VISIBLE);
            findViewById(R.id.proximo).setVisibility(View.VISIBLE);
            findViewById(R.id.exp3).setVisibility(View.VISIBLE);
            findViewById(R.id.exp2).setVisibility(View.GONE);
            findViewById(R.id.avancar).setVisibility(View.GONE);
            findViewById(R.id.imageView44).setVisibility(View.GONE);


        }
    }

    public void voltarTxt(View view) {
        findViewById(R.id.voltar).setVisibility(View.GONE);
        findViewById(R.id.avancar).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView44).setVisibility(View.VISIBLE);
        TextView exp3 = (TextView) findViewById(R.id.exp3);
        if (exp3.getVisibility() == View.VISIBLE) {
            findViewById(R.id.voltar).setVisibility(View.VISIBLE);
            findViewById(R.id.proximo).setVisibility(View.VISIBLE);
            findViewById(R.id.exp3).setVisibility(View.GONE);
            findViewById(R.id.exp2).setVisibility(View.VISIBLE);
            findViewById(R.id.avancar).setVisibility(View.VISIBLE);
            findViewById(R.id.imageView44).setVisibility(View.GONE);


        }
    }
}
