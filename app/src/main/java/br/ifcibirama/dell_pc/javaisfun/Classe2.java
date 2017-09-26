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

public class Classe2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe2);
        setTitle("Classes");
        findViewById(R.id.texto2).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto3).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto4).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto5).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto6).setVisibility(View.INVISIBLE);
        findViewById(R.id.texto7).setVisibility(View.INVISIBLE);
        findViewById(R.id.ant).setVisibility(View.INVISIBLE);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    public void prox(View view) {
        TextView texto1 = (TextView) findViewById(R.id.texto1);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        TextView texto3 = (TextView) findViewById(R.id.texto3);
        TextView texto4 = (TextView) findViewById(R.id.texto4);
        TextView texto5 = (TextView) findViewById(R.id.texto5);
        TextView texto6 = (TextView) findViewById(R.id.texto6);
        TextView texto7 = (TextView) findViewById(R.id.texto7);

        if (texto1.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto1).setVisibility(View.GONE);
            findViewById(R.id.texto2).setVisibility(View.VISIBLE);
            findViewById(R.id.ant).setVisibility(View.VISIBLE);
        } else if (texto2.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto2).setVisibility(View.GONE);
            findViewById(R.id.texto3).setVisibility(View.VISIBLE);
        } else if (texto3.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto3).setVisibility(View.GONE);
            findViewById(R.id.texto4).setVisibility(View.VISIBLE);
        } else if (texto4.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto4).setVisibility(View.GONE);
            findViewById(R.id.texto5).setVisibility(View.VISIBLE);
        } else if (texto5.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto5).setVisibility(View.GONE);
            findViewById(R.id.texto6).setVisibility(View.VISIBLE);
        }else if (texto6.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto6).setVisibility(View.GONE);
            findViewById(R.id.texto7).setVisibility(View.VISIBLE);
            findViewById(R.id.prox).setVisibility(View.GONE);
        }
    }

    public void ant(View view) {

        TextView texto1 = (TextView) findViewById(R.id.texto1);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        TextView texto3 = (TextView) findViewById(R.id.texto3);
        TextView texto4 = (TextView) findViewById(R.id.texto4);
        TextView texto5 = (TextView) findViewById(R.id.texto5);
        TextView texto6 = (TextView) findViewById(R.id.texto6);
        TextView texto7 = (TextView) findViewById(R.id.texto7);

        if (texto2.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto2).setVisibility(View.GONE);
            findViewById(R.id.texto1).setVisibility(View.VISIBLE);
            findViewById(R.id.ant).setVisibility(View.GONE);
            findViewById(R.id.prox).setVisibility(View.VISIBLE);
        } else if (texto3.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto3).setVisibility(View.GONE);
            findViewById(R.id.texto2).setVisibility(View.VISIBLE);
        } else if (texto4.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto4).setVisibility(View.GONE);
            findViewById(R.id.texto3).setVisibility(View.VISIBLE);
        } else if (texto5.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto5).setVisibility(View.GONE);
            findViewById(R.id.texto4).setVisibility(View.VISIBLE);
        } else if (texto6.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto6).setVisibility(View.GONE);
            findViewById(R.id.texto5).setVisibility(View.VISIBLE);
            findViewById(R.id.prox).setVisibility(View.GONE);
        } else if (texto7.getVisibility() == View.VISIBLE) {
            findViewById(R.id.texto7).setVisibility(View.GONE);
            findViewById(R.id.texto6).setVisibility(View.VISIBLE);
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
                Intent intent = new Intent(this, Classe3.class);
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
                                Intent intent = new Intent(Classe2.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Classe.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
