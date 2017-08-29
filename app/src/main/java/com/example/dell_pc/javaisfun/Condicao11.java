package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Condicao11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao11);
        findViewById(R.id.wink).setVisibility(View.GONE);
        findViewById(R.id.explication).setVisibility(View.GONE);
        findViewById(R.id.button17).setVisibility(View.GONE);

    }

    public void explicacao(View view){
        findViewById(R.id.wink).setVisibility(View.VISIBLE);
        findViewById(R.id.explication).setVisibility(View.VISIBLE);
        findViewById(R.id.cod).setVisibility(View.GONE);
        findViewById(R.id.button16).setVisibility(View.GONE);
        findViewById(R.id.textView212).setVisibility(View.GONE);
        findViewById(R.id.button17).setVisibility(View.VISIBLE);
    }
    public void codigo(View view){
        findViewById(R.id.wink).setVisibility(View.GONE);
        findViewById(R.id.explication).setVisibility(View.GONE);
        findViewById(R.id.cod).setVisibility(View.VISIBLE);
        findViewById(R.id.button16).setVisibility(View.VISIBLE);
        findViewById(R.id.button17).setVisibility(View.GONE);
        findViewById(R.id.textView212).setVisibility(View.VISIBLE);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Condicao11.this, MainActivity.class);
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
    public void proximo(View view){
        Intent intent = new Intent(this, Condicao12.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
}
