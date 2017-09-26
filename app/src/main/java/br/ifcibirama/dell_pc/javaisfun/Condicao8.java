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
        setTitle("Condições");
        findViewById(R.id.imageView74).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton131).setVisibility(View.INVISIBLE);
        findViewById(R.id.correto).setVisibility(View.INVISIBLE);
        findViewById(R.id.errado).setVisibility(View.INVISIBLE);
    }
    public void checar(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView74);

        EditText editText = (EditText) findViewById(R.id.exif);
        if(editText.getText().toString().trim().equals("else")){
            findViewById(R.id.imageView45).setVisibility(View.GONE);
            findViewById(R.id.imageButton131).setVisibility(View.VISIBLE);
            findViewById(R.id.correto).setVisibility(View.VISIBLE);
            findViewById(R.id.button6).setVisibility(View.GONE);
            findViewById(R.id.exif).setVisibility(View.GONE);
            findViewById(R.id.textView272).setVisibility(View.GONE);
            findViewById(R.id.textView273).setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.happy);
            imageView.setVisibility(View.VISIBLE);
        }else{
            findViewById(R.id.imageView45).setVisibility(View.GONE);
            findViewById(R.id.errado).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton131).setVisibility(View.VISIBLE);
            findViewById(R.id.exif).setVisibility(View.GONE);
            findViewById(R.id.textView272).setVisibility(View.GONE);
            findViewById(R.id.button6).setVisibility(View.GONE);
            findViewById(R.id.textView273).setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.sad);
            imageView.setVisibility(View.VISIBLE);
        }
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
                Intent intent = new Intent(this, Condicao9.class);
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
                return true;
            case R.id.menu_back:
                Intent intent2 = new Intent(this, Condicao7.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
