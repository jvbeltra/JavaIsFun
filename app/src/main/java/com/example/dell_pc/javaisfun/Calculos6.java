package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class Calculos6 extends AppCompatActivity {

    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos6);
        findViewById(R.id.textView189).setVisibility(View.GONE);
        findViewById(R.id.textView186).setVisibility(View.GONE);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Calculos6.this, MainActivity.class);
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
    public void proximo(View view){
        Intent intent = new Intent(this, Calculos7.class);
        startActivity(intent);
    }

    public void moverInt(View view){

        Button btn_int = (Button) findViewById(R.id.button28);



        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,0.005f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.26f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        cont++;
    }

    public void moverSoma(View view){

        Button btn_int = (Button) findViewById(R.id.button19);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,-0.02f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.26f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        cont++;
    }

    public void moverN1(View view){

        Button btn_int = (Button) findViewById(R.id.button21);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,0.03f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.26f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        cont++;
    }
    public void moverN2(View view){

        Button btn_int = (Button) findViewById(R.id.button22);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,0.07f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.26f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        cont++;
    }
    public void moverIgual(View view){

        Button btn_int = (Button) findViewById(R.id.button23);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,0.27f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.36f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        cont++;

    }

    public void moverMais(View view){

        Button btn_int = (Button) findViewById(R.id.button25);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,0.22f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.36f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        findViewById(R.id.button26).setVisibility(View.GONE);
        findViewById(R.id.button27).setVisibility(View.GONE);
        cont++;
    }

    public void moverPontoEVirgula(View view){

        Button btn_int = (Button) findViewById(R.id.button24);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,-0.15f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.26f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        cont++;

    }
    public void moverResto(View view){

        Button btn_int = (Button) findViewById(R.id.button26);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,0.08f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.36f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);
        findViewById(R.id.button25).setVisibility(View.GONE);
        findViewById(R.id.button27).setVisibility(View.GONE);

    }
    public void moverMenos(View view){

        Button btn_int = (Button) findViewById(R.id.button27);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0,
                TranslateAnimation.RELATIVE_TO_PARENT,-0.06f,
                0,0,
                TranslateAnimation.RELATIVE_TO_PARENT, -0.36f);
        translateAnimation.setDuration(1000);
        translateAnimation.setFillAfter(true);
        btn_int.startAnimation(translateAnimation);

        findViewById(R.id.button26).setVisibility(View.GONE);
        findViewById(R.id.button25).setVisibility(View.GONE);
    }


    public void verf(View view){
        if(cont >= 7){
            findViewById(R.id.textView189).setVisibility(View.VISIBLE);
            findViewById(R.id.textView186).setVisibility(View.GONE);
        }else{
            findViewById(R.id.textView189).setVisibility(View.GONE);
            findViewById(R.id.textView186).setVisibility(View.VISIBLE);
        }
    }
}
