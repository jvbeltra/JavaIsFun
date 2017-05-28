package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(EasyActivity.this, MainActivity.class);
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
    public void oQueEJava(View view){
        Intent intent = new Intent(this, OQueEJava.class);
        startActivity(intent);
    }

    public void variaveis(View view){
        Intent intent = new Intent(this, Variaveis.class);
        startActivity(intent);
    }
    public void modificadores(View view){
        Intent intent = new Intent(this, Modificadores.class);
        startActivity(intent);

    }

    public void operadores(View view){
        Intent intent = new Intent(this, Operadores.class);
        startActivity(intent);
    }
    public void classe(View view){
        Intent intent = new Intent(this, Classe.class);
        startActivity(intent);
    }

    public void metodos(View view){
        Intent intent = new Intent(this, Metodos.class);
        startActivity(intent);
    }
}
