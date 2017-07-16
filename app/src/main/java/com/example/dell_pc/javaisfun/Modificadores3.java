package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Modificadores3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificadores3);
        //first page
        findViewById(R.id.textView45).setVisibility(View.GONE);
        findViewById(R.id.textView46).setVisibility(View.GONE);
        findViewById(R.id.textView47).setVisibility(View.GONE);
        findViewById(R.id.textView48).setVisibility(View.GONE);
        findViewById(R.id.textView49).setVisibility(View.GONE);
        findViewById(R.id.textView50).setVisibility(View.GONE);
        findViewById(R.id.textView51).setVisibility(View.GONE);
        findViewById(R.id.textView52).setVisibility(View.GONE);

        //second page
        findViewById(R.id.textView53).setVisibility(View.GONE);
        findViewById(R.id.textView54).setVisibility(View.GONE);
        findViewById(R.id.textView55).setVisibility(View.GONE);
        findViewById(R.id.textView56).setVisibility(View.GONE);
        findViewById(R.id.textView57).setVisibility(View.GONE);
        findViewById(R.id.textView58).setVisibility(View.GONE);

        findViewById(R.id.imageButton2).setVisibility(View.GONE);

    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Modificadores3.this, MainActivity.class);
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
    public void next(View view){
        Intent intent = new Intent(this, Modificadores4.class);
        startActivity(intent);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int eventAction = event.getAction();
        if(eventAction == event.ACTION_DOWN){
            findViewById(R.id.textView45).setVisibility(View.VISIBLE);
            findViewById(R.id.textView46).setVisibility(View.VISIBLE);
            findViewById(R.id.textView47).setVisibility(View.VISIBLE);
            findViewById(R.id.textView48).setVisibility(View.VISIBLE);
            findViewById(R.id.textView49).setVisibility(View.VISIBLE);
            findViewById(R.id.textView50).setVisibility(View.VISIBLE);
            findViewById(R.id.textView51).setVisibility(View.VISIBLE);
            findViewById(R.id.textView52).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
            //second page
            findViewById(R.id.textView53).setVisibility(View.GONE);
            findViewById(R.id.textView54).setVisibility(View.GONE);
            findViewById(R.id.textView55).setVisibility(View.GONE);
            findViewById(R.id.textView56).setVisibility(View.GONE);
            findViewById(R.id.textView57).setVisibility(View.GONE);
            findViewById(R.id.textView58).setVisibility(View.GONE);

        }else if(eventAction == event.ACTION_MOVE){
            findViewById(R.id.textView45).setVisibility(View.GONE);
            findViewById(R.id.textView46).setVisibility(View.GONE);
            findViewById(R.id.textView47).setVisibility(View.GONE);
            findViewById(R.id.textView48).setVisibility(View.GONE);
            findViewById(R.id.textView49).setVisibility(View.GONE);
            findViewById(R.id.textView50).setVisibility(View.GONE);
            findViewById(R.id.textView51).setVisibility(View.GONE);
            findViewById(R.id.textView52).setVisibility(View.GONE);

            //second page
            findViewById(R.id.textView53).setVisibility(View.VISIBLE);
            findViewById(R.id.textView54).setVisibility(View.VISIBLE);
            findViewById(R.id.textView55).setVisibility(View.VISIBLE);
            findViewById(R.id.textView56).setVisibility(View.VISIBLE);
            findViewById(R.id.textView57).setVisibility(View.VISIBLE);
            findViewById(R.id.textView58).setVisibility(View.VISIBLE);

            findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
        }



        return super.onTouchEvent(event);
    }
}
