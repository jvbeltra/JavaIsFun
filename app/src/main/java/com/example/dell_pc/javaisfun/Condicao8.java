package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Condicao8 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao8);
        findViewById(R.id.imageButton131).setVisibility(View.INVISIBLE);
        findViewById(R.id.correto).setVisibility(View.INVISIBLE);
        findViewById(R.id.errado).setVisibility(View.INVISIBLE);
    }
    public void checar(View view){
        EditText editText = (EditText) findViewById(R.id.exif);
        if(editText.getText().toString().trim().equals("else")){
            findViewById(R.id.imageView45).setVisibility(View.GONE);
            findViewById(R.id.imageButton131).setVisibility(View.VISIBLE);
            findViewById(R.id.correto).setVisibility(View.VISIBLE);
            findViewById(R.id.button6).setVisibility(View.GONE);
            findViewById(R.id.exif).setVisibility(View.GONE);
            findViewById(R.id.textView272).setVisibility(View.GONE);
            findViewById(R.id.textView273).setVisibility(View.GONE);
        }else{
            findViewById(R.id.imageView45).setVisibility(View.GONE);
            findViewById(R.id.errado).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton131).setVisibility(View.VISIBLE);
            findViewById(R.id.exif).setVisibility(View.GONE);
            findViewById(R.id.textView272).setVisibility(View.GONE);
            findViewById(R.id.button6).setVisibility(View.GONE);
            findViewById(R.id.textView273).setVisibility(View.GONE);
        }
    }
    public void next(View view){
        Intent intent = new Intent(this, Condicao9.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);

    }

    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Condicao8.this, MainActivity.class);
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
}
