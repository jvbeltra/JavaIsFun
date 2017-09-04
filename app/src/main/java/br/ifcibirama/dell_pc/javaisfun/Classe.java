package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Classe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe);
        findViewById(R.id.texto1).setVisibility(View.VISIBLE);
        findViewById(R.id.ant).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton46).setVisibility(View.INVISIBLE);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    public void prox(View view) {
        TextView texto1 = (TextView) findViewById(R.id.texto1);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        TextView texto3 = (TextView) findViewById(R.id.texto3);

        if (texto1.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto1).setVisibility(View.GONE);
            findViewById(R.id.texto2).setVisibility(View.VISIBLE);
            findViewById(R.id.ant).setVisibility(View.VISIBLE);
        } else if (texto2.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto2).setVisibility(View.GONE);
            findViewById(R.id.texto3).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton46).setVisibility(View.VISIBLE);
            findViewById(R.id.prox).setVisibility(View.GONE);
        }
    }

    public void ant(View view) {

        TextView texto1 = (TextView) findViewById(R.id.texto1);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        TextView texto3 = (TextView) findViewById(R.id.texto3);

        if (texto3.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto3).setVisibility(View.GONE);
            findViewById(R.id.texto2).setVisibility(View.VISIBLE);
        } else if (texto2.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto2).setVisibility(View.GONE);
            findViewById(R.id.texto1).setVisibility(View.VISIBLE);
            findViewById(R.id.ant).setVisibility(View.GONE);
            findViewById(R.id.prox).setVisibility(View.VISIBLE);

        }
    }


    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Classe.this, MainActivity.class);
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

    public void next(View view) {
        Intent intent = new Intent(this, Classe2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }





}


