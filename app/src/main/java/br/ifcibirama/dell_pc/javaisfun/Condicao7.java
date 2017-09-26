package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Condicao7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao7);
        setTitle("Condições");
        findViewById(R.id.voltar).setVisibility(View.INVISIBLE);
        findViewById(R.id.proximo).setVisibility(View.INVISIBLE);
        findViewById(R.id.exp2  ).setVisibility(View.INVISIBLE);
        findViewById(R.id.exp3).setVisibility(View.INVISIBLE);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

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
                Intent intent = new Intent(this, Condicao8.class);
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
                                Intent intent = new Intent(Condicao7.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Condicao6.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void avancarTxt(View view) {
        ImageView imageView44 = (ImageView) findViewById(R.id.imageView44);
        TextView exp2 = (TextView) findViewById(R.id.exp2);
        if(imageView44.getVisibility()==View.VISIBLE) {
            findViewById(R.id.voltar).setVisibility(View.VISIBLE);
            findViewById(R.id.proximo).setVisibility(View.GONE);
            findViewById(R.id.exp2).setVisibility(View.VISIBLE);
            findViewById(R.id.avancar).setVisibility(View.VISIBLE);
            findViewById(R.id.imageView44).setVisibility(View.GONE);
        }else
        if (exp2.getVisibility() == View.VISIBLE) {
            findViewById(R.id.voltar).setVisibility(View.VISIBLE);
            findViewById(R.id.proximo).setVisibility(View.VISIBLE);
            findViewById(R.id.exp3).setVisibility(View.VISIBLE);
            findViewById(R.id.exp2).setVisibility(View.GONE);
            findViewById(R.id.avancar).setVisibility(View.GONE);
            findViewById(R.id.imageView44).setVisibility(View.GONE);


        }
    }

    public void voltarTxt(View view) {
        findViewById(R.id.voltar).setVisibility(View.GONE);
        findViewById(R.id.avancar).setVisibility(View.VISIBLE);
        findViewById(R.id.imageView44).setVisibility(View.VISIBLE);
        TextView exp3 = (TextView) findViewById(R.id.exp3);
        if (exp3.getVisibility() == View.VISIBLE) {
            findViewById(R.id.voltar).setVisibility(View.VISIBLE);
            findViewById(R.id.proximo).setVisibility(View.VISIBLE);
            findViewById(R.id.exp3).setVisibility(View.GONE);
            findViewById(R.id.exp2).setVisibility(View.VISIBLE);
            findViewById(R.id.avancar).setVisibility(View.VISIBLE);
            findViewById(R.id.imageView44).setVisibility(View.GONE);


        }
    }
}
