package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Variaveis3 extends AppCompatActivity {
    public TextView textView;
    public ImageButton imageButton;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variaveis3);
        findViewById(R.id.textView7).setVisibility(View.GONE);
        findViewById(R.id.imageButton2).setVisibility(View.GONE);
        findViewById(R.id.textView9).setVisibility(View.GONE);
        findViewById(R.id.imageView3).setVisibility(View.GONE);
        findViewById(R.id.imageView7).setVisibility(View.GONE);

    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Variaveis3.this, MainActivity.class);
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

    @Override
    public boolean onTouchEvent(MotionEvent event) {




            findViewById(R.id.textView7).setVisibility(View.VISIBLE);

            findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);


        findViewById(R.id.textView9).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView3).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView7).setVisibility(View.VISIBLE);


        return super.onTouchEvent(event);

    }
    public void next(View view){
        Intent intent = new Intent(this, Variaveis4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }







}
