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

public class Condicao15 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao15);
        setTitle("Condições");
        findViewById(R.id.textCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.wink).setVisibility(View.INVISIBLE);
        findViewById(R.id.buttonNext).setVisibility(View.INVISIBLE);
        findViewById(R.id.textErrado).setVisibility(View.INVISIBLE);
        findViewById(R.id.enunciadoErrado).setVisibility(View.GONE);

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
                Intent intent = new Intent(this, Condicao16.class);
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
                                Intent intent = new Intent(Condicao15.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Condicao14.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void verifCorreto(View view) {
        imageView = (ImageView) findViewById(R.id.wink);
        imageView.setImageResource(R.drawable.happy);
        imageView.setVisibility(View.VISIBLE);

        findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
        findViewById(R.id.enunciado).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado3).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado2).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado1).setVisibility(View.GONE);
        findViewById(R.id.buttonCorreto).setVisibility(View.GONE);
        findViewById(R.id.buttonNext).setVisibility(View.VISIBLE);
        findViewById(R.id.vmsPrati).setVisibility(View.GONE);
        findViewById(R.id.atividade).setVisibility(View.GONE);
        findViewById(R.id.space).setVisibility(View.GONE);

    }

    public void verifErrado(View view) {
        imageView = (ImageView) findViewById(R.id.wink);
        imageView.setImageResource(R.drawable.sad);
        imageView.setVisibility(View.VISIBLE);
        findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
        findViewById(R.id.buttonErrado3).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado2).setVisibility(View.GONE);
        findViewById(R.id.buttonErrado1).setVisibility(View.GONE);
        findViewById(R.id.buttonCorreto).setVisibility(View.GONE);
        findViewById(R.id.enunciado).setVisibility(View.GONE);
        findViewById(R.id.buttonNext).setVisibility(View.VISIBLE);
        findViewById(R.id.vmsPrati).setVisibility(View.GONE);
        findViewById(R.id.atividade).setVisibility(View.GONE);
        findViewById(R.id.space).setVisibility(View.GONE);
        findViewById(R.id.enunciadoErrado).setVisibility(View.VISIBLE);
    }


}
