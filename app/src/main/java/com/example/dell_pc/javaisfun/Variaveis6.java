package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Variaveis6 extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variaveis6);
        findViewById(R.id.textView25).setVisibility(View.GONE);
        findViewById(R.id.imageView5).setVisibility(View.GONE);
        findViewById(R.id.imageButton2).setVisibility(View.GONE);
        findViewById(R.id.textView26).setVisibility(View.GONE);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Variaveis6.this, MainActivity.class);
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
        Intent intent = new Intent(this, Variaveis7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void verificar(View view){
        EditText edit_text = (EditText) findViewById(R.id.editText3);


        if(edit_text.getText().toString().trim().equals("int numeroDePrateleiras = 10;") || edit_text.getText().toString().trim().equals("int numeroDePrateleiras= 10;") ||edit_text.getText().toString().trim().equals("int numeroDePrateleiras =10;")||edit_text.getText().toString().trim().equals("int numeroDePrateleiras=10;")||edit_text.getText().toString().trim().equals("int numeroDePrateleiras = 10 ;") || edit_text.getText().toString().trim().equals("int numeroDePrateleiras= 10 ;") ||edit_text.getText().toString().trim().equals("int numeroDePrateleiras =10 ;")||edit_text.getText().toString().trim().equals("int numeroDePrateleiras=10 ; ") || edit_text.getText().toString().trim().equals("int numeroDePrateleiras = 10; ") || edit_text.getText().toString().trim().equals("int numeroDePrateleiras= 10; ") ||edit_text.getText().toString().trim().equals("int numeroDePrateleiras =10; ")||edit_text.getText().toString().trim().equals("int numeroDePrateleiras=10; ")||edit_text.getText().toString().trim().equals("int numeroDePrateleiras = 10 ; ") || edit_text.getText().toString().trim().equals("int numeroDePrateleiras= 10 ; ") ||edit_text.getText().toString().trim().equals("int numeroDePrateleiras =10 ; ")||edit_text.getText().toString().trim().equals("int numeroDePrateleiras=10 ; ")){
            findViewById(R.id.textView25).setVisibility(View.VISIBLE);
            findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
            findViewById(R.id.textView26).setVisibility(View.GONE);
            findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
            findViewById(R.id.button).setVisibility(View.GONE);
        }else{
            findViewById(R.id.textView26).setVisibility(View.VISIBLE);
            findViewById(R.id.textView25).setVisibility(View.GONE);
            findViewById(R.id.imageView5).setVisibility(View.GONE);
        }
    }
}
