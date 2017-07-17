package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Metodos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos2);
        findViewById(R.id.imageButton20).setVisibility(View.GONE);
        findViewById(R.id.textView62).setVisibility(View.GONE);
        findViewById(R.id.textView63).setVisibility(View.GONE);
        findViewById(R.id.textView64).setVisibility(View.GONE);
        findViewById(R.id.textView65).setVisibility(View.GONE);
        findViewById(R.id.textView73).setVisibility(View.GONE);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Metodos2.this, MainActivity.class);
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
        Intent intent = new Intent(this, Metodos3.class);
        startActivity(intent);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        findViewById(R.id.imageButton20).setVisibility(View.VISIBLE);
        findViewById(R.id.textView62).setVisibility(View.VISIBLE);
        findViewById(R.id.textView63).setVisibility(View.VISIBLE);
        findViewById(R.id.textView64).setVisibility(View.VISIBLE);
        findViewById(R.id.textView65).setVisibility(View.VISIBLE);
        findViewById(R.id.textView73).setVisibility(View.VISIBLE);
        return super.onTouchEvent(event);
    }
}
