package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EasyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        setTitle("Básico");


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        overridePendingTransition( R.anim.left_in, R.anim.left_out);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_just_go, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void oQueEJava(View view){
        Intent intent = new Intent(this, OQueEJava.class);
        startActivity(intent);

        overridePendingTransition(R.anim.left_in, R.anim.left_out);

    }

    public void boasPraticas(View view){
        Intent intent = new Intent(this, BoasPraticas.class);
        startActivity(intent);

        overridePendingTransition(R.anim.left_in, R.anim.left_out);

    }

    public void variaveis(View view){
        Intent intent = new Intent(this, Variaveis.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void modificadores(View view){
        Intent intent = new Intent(this, Modificadores.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void operadores(View view){
        Intent intent = new Intent(this, Operadores.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void classe(View view){
        Intent intent = new Intent(this, Classe.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void metodos(View view){
        Intent intent = new Intent(this, Metodos.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
}
