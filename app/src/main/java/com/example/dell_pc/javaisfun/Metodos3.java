package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Metodos3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos3);
        findViewById(R.id.imageButton20).setVisibility(View.GONE);
        findViewById(R.id.textView76).setVisibility(View.GONE);
        findViewById(R.id.textView77).setVisibility(View.GONE);
        findViewById(R.id.textView79).setVisibility(View.GONE);
        findViewById(R.id.textView80).setVisibility(View.GONE);
        findViewById(R.id.textView81).setVisibility(View.GONE);
        findViewById(R.id.textView82).setVisibility(View.GONE);
        findViewById(R.id.textView83).setVisibility(View.GONE);
        findViewById(R.id.textView84).setVisibility(View.GONE);
        findViewById(R.id.imageView12).setVisibility(View.GONE);

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
                        Intent intent = new Intent(Metodos3.this, MainActivity.class);
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
        Intent intent = new Intent(this, Metodos4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        findViewById(R.id.imageButton20).setVisibility(View.VISIBLE);
        findViewById(R.id.textView76).setVisibility(View.VISIBLE);
        findViewById(R.id.textView77).setVisibility(View.VISIBLE);
        findViewById(R.id.textView79).setVisibility(View.VISIBLE);
        findViewById(R.id.textView80).setVisibility(View.VISIBLE);
        findViewById(R.id.textView81).setVisibility(View.VISIBLE);
        findViewById(R.id.textView82).setVisibility(View.VISIBLE);
        findViewById(R.id.textView83).setVisibility(View.VISIBLE);
        findViewById(R.id.textView84).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView12).setVisibility(View.VISIBLE);
        return super.onTouchEvent(event);
    }
}
