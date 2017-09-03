package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Matrizes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrizes);
        findViewById(R.id.istoMatriz).setVisibility(View.GONE);
        findViewById(R.id.matriz).setVisibility(View.GONE);
        findViewById(R.id.buttonProx).setVisibility(View.GONE);
        findViewById(R.id.textMatriz2).setVisibility(View.GONE);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Matrizes.this, MainActivity.class);
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

                        findViewById(R.id.titMatriz).setAnimation(animation);
                        findViewById(R.id.titMatriz).setVisibility(View.VISIBLE);

                        findViewById(R.id.textMatriz).setAnimation(animation);
                        findViewById(R.id.textMatriz).setVisibility(View.VISIBLE);

                        findViewById(R.id.istoMatriz).setAnimation(animation1);
                        findViewById(R.id.istoMatriz).setVisibility(View.GONE);

                        findViewById(R.id.matriz).setAnimation(animation1);
                        findViewById(R.id.matriz).setVisibility(View.GONE);

                        findViewById(R.id.vetor).setAnimation(animation);
                        findViewById(R.id.vetor).setVisibility(View.VISIBLE);

                        findViewById(R.id.textMatriz2).setAnimation(animation1);
                        findViewById(R.id.textMatriz2).setVisibility(View.GONE);

                        findViewById(R.id.istoVetor).setAnimation(animation);
                        findViewById(R.id.istoVetor).setVisibility(View.VISIBLE);
                    }

                    // Right to left swipe action
                    else {
                        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.left_out);

                        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.left_in);

                        findViewById(R.id.titMatriz).setAnimation(animation);
                        findViewById(R.id.titMatriz).setVisibility(View.GONE);

                        findViewById(R.id.textMatriz).setAnimation(animation);
                        findViewById(R.id.textMatriz).setVisibility(View.GONE);

                        findViewById(R.id.istoMatriz).setAnimation(animation1);
                        findViewById(R.id.istoMatriz).setVisibility(View.VISIBLE);

                        findViewById(R.id.textMatriz2).setAnimation(animation1);
                        findViewById(R.id.textMatriz2).setVisibility(View.VISIBLE);

                        findViewById(R.id.matriz).setAnimation(animation1);
                        findViewById(R.id.matriz).setVisibility(View.VISIBLE);

                        findViewById(R.id.vetor).setAnimation(animation);
                        findViewById(R.id.vetor).setVisibility(View.GONE);

                        findViewById(R.id.istoVetor).setAnimation(animation);
                        findViewById(R.id.istoVetor).setVisibility(View.GONE);

                        findViewById(R.id.buttonProx).setAnimation(animation1);
                        findViewById(R.id.buttonProx).setVisibility(View.VISIBLE);



                    }

                }
                break;
        }

        return super.onTouchEvent(event);
    }
    public void next(View view){
        Intent intent = new Intent(this, Matrizes2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

}
