package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Scanner2 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Scanner.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner2);
        setTitle("Scanner");
        findViewById(R.id.explicacao).setVisibility(View.GONE);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back_green, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, Scanner3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finishAffinity();
                return true;

            case R.id.menu_home:
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(this);

                builder.setTitle("Home")
                        .setMessage("Você tem certeza que quer voltar ao menu principal?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Scanner2.this, MainActivity.class);
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
                return true;
            case R.id.menu_back:
                Intent intent2 = new Intent(this, Scanner.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


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

                        findViewById(R.id.introducao).setAnimation(animation);
                        findViewById(R.id.introducao).setVisibility(View.VISIBLE);

                        findViewById(R.id.paraUtilizar).setAnimation(animation);
                        findViewById(R.id.paraUtilizar).setVisibility(View.VISIBLE);

                        findViewById(R.id.explicacao).setAnimation(animation1);
                        findViewById(R.id.explicacao).setVisibility(View.GONE);

                        findViewById(R.id.declararScanner).setAnimation(animation);
                        findViewById(R.id.declararScanner).setVisibility(View.VISIBLE);

                        findViewById(R.id.textView356).setAnimation(animation);
                        findViewById(R.id.textView356).setVisibility(View.VISIBLE);

                        findViewById(R.id.exemploScanner).setAnimation(animation);
                        findViewById(R.id.exemploScanner).setVisibility(View.VISIBLE);

                    }

                    // Right to left swipe action
                    else {
                        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.left_out);

                        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                                R.anim.left_in);

                        findViewById(R.id.introducao).setAnimation(animation);
                        findViewById(R.id.introducao).setVisibility(View.GONE);

                        findViewById(R.id.paraUtilizar).setAnimation(animation);
                        findViewById(R.id.paraUtilizar).setVisibility(View.GONE);

                        findViewById(R.id.textView356).setAnimation(animation);
                        findViewById(R.id.textView356).setVisibility(View.GONE);

                        findViewById(R.id.explicacao).setAnimation(animation1);
                        findViewById(R.id.explicacao).setVisibility(View.VISIBLE);

                        findViewById(R.id.declararScanner).setAnimation(animation);
                        findViewById(R.id.declararScanner).setVisibility(View.GONE);

                        findViewById(R.id.exemploScanner).setAnimation(animation);
                        findViewById(R.id.exemploScanner).setVisibility(View.GONE);



                    }

                }
                break;
        }

        return super.onTouchEvent(event);
    }


}
