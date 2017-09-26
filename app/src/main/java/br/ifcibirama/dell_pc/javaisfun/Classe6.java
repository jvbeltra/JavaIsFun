package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Classe6 extends AppCompatActivity {
    int cont = 0;
    int contAct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe6);
        setTitle("Classes");
        findViewById(R.id.imageView73).setVisibility(View.INVISIBLE);
        findViewById(R.id.textCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.textErrado).setVisibility(View.INVISIBLE);
        findViewById(R.id.prox).setVisibility(View.INVISIBLE);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    public void checar(View view) {
        EditText edText1 = (EditText) findViewById(R.id.edText1);
        EditText edText2 = (EditText) findViewById(R.id.edText2);
        EditText edText3 = (EditText) findViewById(R.id.edText3);
        EditText edText4 = (EditText) findViewById(R.id.edText4);
        EditText edText5 = (EditText) findViewById(R.id.edText5);
        EditText edText6 = (EditText) findViewById(R.id.edText6);
        ImageView imageView = (ImageView) findViewById(R.id.imageView73);

        if (edText1.getText().toString().equals("class")
                && edText2.getText().toString().equals("int")
                && edText3.getText().toString().equals("String")
                && edText4.getText().toString().equals("double")
                && edText5.getText().toString().equals("void") &&
                edText6.getText().toString().equals("+")) {
            findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.textErrado).setVisibility(View.GONE);
            findViewById(R.id.prox).setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.happy);
            imageView.setVisibility(View.VISIBLE);

        } else {
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
            findViewById(R.id.prox).setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.sad);
            imageView.setVisibility(View.VISIBLE);
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
                Intent intent = new Intent(this, Classe7.class);
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
                                Intent intent = new Intent(Classe6.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Classe5.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}




