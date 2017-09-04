package br.ifcibirama.dell_pc.javaisfun;

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
                        Intent intent = new Intent(Metodos2.this, MainActivity.class);
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
    public void next(View view){
        Intent intent = new Intent(this, Metodos3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);

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
