package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.app.usage.UsageEvents;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Scanner7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner7);
        findViewById(R.id.textErrado).setVisibility(View.INVISIBLE);
        findViewById(R.id.textErrado2).setVisibility(View.INVISIBLE);
        findViewById(R.id.wink).setVisibility(View.INVISIBLE);
        findViewById(R.id.textCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.buttonProx).setVisibility(View.INVISIBLE);
        findViewById(R.id.incorreto).setVisibility(View.INVISIBLE);

    }

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
                        Intent intent = new Intent(Scanner7.this, MainActivity.class);
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
        Intent intent = new Intent(this, Scanner7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }


    private float x1, x2;
    static final int MIN_DISTANCE = 150;


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                float deltaX = x2 - x1;
                if (Math.abs(deltaX) > MIN_DISTANCE) {
                    // Left to Right swipe action
                    if (x2 > x1) {
                        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.rigth_in);
                        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.rigth_out);

                        findViewById(R.id.correto).setAnimation(animation);
                        findViewById(R.id.correto).setVisibility(View.VISIBLE);

                        findViewById(R.id.incorreto).setAnimation(animation1);
                        findViewById(R.id.incorreto).setVisibility(View.GONE);


                    }

                    // Right to left swipe action
                    else {
                        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.left_out);

                        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.left_in);


                        findViewById(R.id.correto).setAnimation(animation);
                        findViewById(R.id.correto).setVisibility(View.GONE);

                        findViewById(R.id.incorreto).setAnimation(animation1);
                        findViewById(R.id.incorreto).setVisibility(View.VISIBLE);


                    }

                }
                break;
        }

        return super.onTouchEvent(event);
    }

    public void selecionar(View view) {
        ImageView incorreto = (ImageView) findViewById(R.id.incorreto);
        ImageView correto = (ImageView) findViewById(R.id.correto);
        if (incorreto.getVisibility() == View.VISIBLE) {
            findViewById(R.id.titulo1).setVisibility(View.GONE);
            findViewById(R.id.titulo2).setVisibility(View.GONE);
            findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.wink).setVisibility(View.VISIBLE);
            findViewById(R.id.buttonProx).setVisibility(View.VISIBLE);
            findViewById(R.id.deslizeWarn).setVisibility(View.GONE);
            findViewById(R.id.incorreto).setVisibility(View.GONE);
        } else if (correto.getVisibility() == View.VISIBLE) {
            findViewById(R.id.titulo1).setVisibility(View.GONE);
            findViewById(R.id.titulo2).setVisibility(View.GONE);
            findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
            findViewById(R.id.textErrado2).setVisibility(View.VISIBLE);
            findViewById(R.id.buttonProx).setVisibility(View.VISIBLE);
            findViewById(R.id.deslizeWarn).setVisibility(View.GONE);
            findViewById(R.id.correto).setVisibility(View.GONE);
        }

    }
}
