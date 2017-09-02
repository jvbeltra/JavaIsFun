package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Vetores10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetores10);
        findViewById(R.id.imageView69).setVisibility(View.GONE);
        findViewById(R.id.imageButton151).setVisibility(View.GONE);
        findViewById(R.id.textView323).setVisibility(View.GONE);
        findViewById(R.id.textView324).setVisibility(View.GONE);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Vetores10.this, MainActivity.class);
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
    public void next(View view){
        Intent intent = new Intent(this, Vetores11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void verificar(View view){
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText5);
        EditText editText3 = (EditText) findViewById(R.id.editText6);
        ImageView imageView = (ImageView) findViewById(R.id.imageView69);
        if(editText.getText().toString().equalsIgnoreCase("[]")&& editText2.getText().toString().equalsIgnoreCase("5") && editText3.getText().toString().equalsIgnoreCase("vetor[i]")){
            findViewById(R.id.imageButton151).setVisibility(View.VISIBLE);
            findViewById(R.id.textView323).setVisibility(View.VISIBLE);
            findViewById(R.id.textView324).setVisibility(View.GONE);
            findViewById(R.id.button36).setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.checkmarkred);
        }else{
            findViewById(R.id.textView323).setVisibility(View.GONE);
            findViewById(R.id.textView324).setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.sad);
            imageView.setVisibility(View.VISIBLE);
        }
    }
}
