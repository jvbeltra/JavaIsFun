package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Classe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe);
        setTitle("Classes");
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, Classe2.class);
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
                return true;
            case R.id.menu_back:
                Intent intent2 = new Intent(this, EasyActivity.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }




}


