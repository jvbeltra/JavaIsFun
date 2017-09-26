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

public class Classe4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe4);
        setTitle("Classes");
        findViewById(R.id.antP).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton63).setVisibility(View.INVISIBLE);
        findViewById(R.id.erradoAbelha).setVisibility(View.INVISIBLE);
        findViewById(R.id.textCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.erradoGato).setVisibility(View.INVISIBLE);
        findViewById(R.id.erradoCachorro).setVisibility(View.INVISIBLE);
        findViewById(R.id.classgato).setVisibility(View.INVISIBLE);
        findViewById(R.id.classcachorro).setVisibility(View.INVISIBLE);
        findViewById(R.id.classpeixe).setVisibility(View.INVISIBLE);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    public void prox(View view) {
        ImageView imageViewtop = (ImageView) findViewById(R.id.corretoerrado);
        ImageView classpeixe = (ImageView) findViewById(R.id.classpeixe);
        ImageView classcachorro = (ImageView) findViewById(R.id.classcachorro);
        ImageView classgato = (ImageView) findViewById(R.id.classgato);
        ImageView classabelha = (ImageView) findViewById(R.id.classabelha);
        TextView erradoabelha = (TextView) findViewById(R.id.erradoAbelha);
        TextView erradocachorro = (TextView) findViewById(R.id.erradoCachorro);
        TextView erradogato = (TextView) findViewById(R.id.erradoGato);
        imageViewtop.setVisibility(View.GONE);
        if (classabelha.getVisibility() == View.VISIBLE || erradoabelha.getVisibility() == View.VISIBLE) {
            findViewById(R.id.classabelha).setVisibility(View.GONE);
            findViewById(R.id.classgato).setVisibility(View.VISIBLE);
            findViewById(R.id.antP).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            imageViewtop.setVisibility(View.GONE);
        } else if (classgato.getVisibility() == View.VISIBLE || erradogato.getVisibility() == View.VISIBLE) {
            findViewById(R.id.classgato).setVisibility(View.GONE);
            findViewById(R.id.classcachorro).setVisibility(View.VISIBLE);
            findViewById(R.id.antP).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            imageViewtop.setVisibility(View.GONE);
        } else if (classcachorro.getVisibility() == View.VISIBLE || erradocachorro.getVisibility() == View.VISIBLE) {
            findViewById(R.id.classcachorro).setVisibility(View.GONE);
            findViewById(R.id.classpeixe).setVisibility(View.VISIBLE);
            findViewById(R.id.proxP).setVisibility(View.GONE);
            findViewById(R.id.antP).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            imageViewtop.setVisibility(View.GONE);
        }
    }

    public void ant(View view) {
        ImageView imageViewtop = (ImageView) findViewById(R.id.corretoerrado);

        TextView textocorreto = (TextView) findViewById(R.id.textCorreto);
        TextView erradocachorro = (TextView) findViewById(R.id.erradoCachorro);
        TextView erradogato = (TextView) findViewById(R.id.erradoGato);
        ImageView classpeixe = (ImageView) findViewById(R.id.classpeixe);
        ImageView classcachorro = (ImageView) findViewById(R.id.classcachorro);
        ImageView classgato = (ImageView) findViewById(R.id.classgato);
        ImageView classabelha = (ImageView) findViewById(R.id.classabelha);


        if (classgato.getVisibility() == View.VISIBLE || erradogato.getVisibility() == View.VISIBLE) {
            findViewById(R.id.classgato).setVisibility(View.GONE);
            findViewById(R.id.classabelha).setVisibility(View.VISIBLE);
            findViewById(R.id.antP).setVisibility(View.GONE);
            findViewById(R.id.proxP).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            imageViewtop.setVisibility(View.GONE);
        } else if (classcachorro.getVisibility() == View.VISIBLE || erradocachorro.getVisibility() == View.VISIBLE) {
            findViewById(R.id.classcachorro).setVisibility(View.GONE);
            findViewById(R.id.classgato).setVisibility(View.VISIBLE);
            findViewById(R.id.proxP).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            imageViewtop.setVisibility(View.GONE);
        } else if (classpeixe.getVisibility() == View.VISIBLE || textocorreto.getVisibility() == View.VISIBLE) {
            findViewById(R.id.classpeixe).setVisibility(View.GONE);
            findViewById(R.id.classcachorro).setVisibility(View.VISIBLE);
            findViewById(R.id.proxP).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            imageViewtop.setVisibility(View.GONE);

        }

    }

    public void verificar(View view) {
        ImageView imageViewtop = (ImageView) findViewById(R.id.corretoerrado);

        TextView erradoabelha = (TextView) findViewById(R.id.erradoAbelha);
        TextView erradocachorro = (TextView) findViewById(R.id.erradoCachorro);
        TextView erradogato = (TextView) findViewById(R.id.erradoGato);
        TextView textocorreto = (TextView) findViewById(R.id.textCorreto);
        ImageView classpeixe = (ImageView) findViewById(R.id.classpeixe);
        ImageView classcachorro = (ImageView) findViewById(R.id.classcachorro);
        ImageView classgato = (ImageView) findViewById(R.id.classgato);
        ImageView classabelha = (ImageView) findViewById(R.id.classabelha);
        if (classpeixe.getVisibility() == View.VISIBLE) {
            findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton63).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            findViewById(R.id.classpeixe).setVisibility(View.GONE);
            imageViewtop.setImageResource(R.drawable.happy);
            imageViewtop.setVisibility(View.VISIBLE);
        } else if (classcachorro.getVisibility() == View.VISIBLE) {
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.imageButton63).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            findViewById(R.id.erradoCachorro).setVisibility(View.VISIBLE);
            findViewById(R.id.classcachorro).setVisibility(View.GONE);
            imageViewtop.setImageResource(R.drawable.sad);
            imageViewtop.setVisibility(View.VISIBLE);
        } else if (classgato.getVisibility() == View.VISIBLE) {
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.imageButton63).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoAbelha).setVisibility(View.GONE);
            findViewById(R.id.erradoGato).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            findViewById(R.id.classgato).setVisibility(View.GONE);
            imageViewtop.setImageResource(R.drawable.sad);
            imageViewtop.setVisibility(View.VISIBLE);
        } else if (classabelha.getVisibility() == View.VISIBLE) {
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.imageButton63).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoAbelha).setVisibility(View.VISIBLE);
            findViewById(R.id.erradoGato).setVisibility(View.GONE);
            findViewById(R.id.erradoCachorro).setVisibility(View.GONE);
            findViewById(R.id.classabelha).setVisibility(View.GONE);
            imageViewtop.setImageResource(R.drawable.sad);
            imageViewtop.setVisibility(View.VISIBLE);
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
                Intent intent = new Intent(this, Classe5.class);
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
                                Intent intent = new Intent(Classe4.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Classe3.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

}

