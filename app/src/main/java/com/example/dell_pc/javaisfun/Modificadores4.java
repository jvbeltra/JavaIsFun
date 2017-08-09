package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Modificadores4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificadores4);
        findViewById(R.id.textView68).setVisibility(View.GONE);
        findViewById(R.id.textView74).setVisibility(View.GONE);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Modificadores4.this, MainActivity.class);
                        startActivity(intent);
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
    public void next(View view){
        Intent intent = new Intent(this, Modificadores5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);

    }
    public boolean onTouchEvent(MotionEvent event) {
        int eventAction = event.getAction();
        if (eventAction == event.ACTION_DOWN) {
            findViewById(R.id.textView68).setVisibility(View.VISIBLE);
            findViewById(R.id.textView70).setVisibility(View.GONE);
        }else if(eventAction == event.ACTION_UP){
            findViewById(R.id.textView68).setVisibility(View.GONE);
            findViewById(R.id.textView70).setVisibility(View.VISIBLE);
        }
        findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);

        findViewById(R.id.textView72).setVisibility(View.GONE);
        findViewById(R.id.textView74).setVisibility(View.VISIBLE);
        return super.onTouchEvent(event);
    }
    }
