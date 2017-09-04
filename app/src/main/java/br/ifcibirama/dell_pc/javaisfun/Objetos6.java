package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Objetos6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos6);
        findViewById(R.id.textView489).setVisibility(View.INVISIBLE);
        findViewById(R.id.textView487).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton207).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageView81).setVisibility(View.INVISIBLE);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

    }

    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Objetos6.this, MainActivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
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
        Intent intent = new Intent(this, Objetos7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void correto(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView81);
        findViewById(R.id.textView487).setVisibility(View.VISIBLE);
        findViewById(R.id.textView489).setVisibility(View.GONE);
        findViewById(R.id.imageButton207).setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.happy);

    }
    public void errado(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView81);
        findViewById(R.id.textView489).setVisibility(View.VISIBLE);
        findViewById(R.id.textView487).setVisibility(View.GONE);
        findViewById(R.id.imageButton207).setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.sad);
    }

}
