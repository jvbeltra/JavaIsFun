package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Condicao9 extends AppCompatActivity {

    private Spinner spinner4;
    private Button confirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao9);
        verificarSpinner();
        findViewById(R.id.wink).setVisibility(View.INVISIBLE);
        findViewById(R.id.correto).setVisibility(View.INVISIBLE);
        findViewById(R.id.prox).setVisibility(View.INVISIBLE);
        findViewById(R.id.errado).setVisibility(View.INVISIBLE);
        findViewById(R.id.titErrado).setVisibility(View.INVISIBLE);
    }



    public void proximo(View view){
        Intent intent = new Intent(this, Condicao10.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Condicao9.this, MainActivity.class);
                        startActivity(intent);
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
    public void addListenerOnSpinnerItemSelection() {
        spinner4 = (Spinner) findViewById(R.id.spinner4);

    }

    public void verificarSpinner() {

        spinner4 = (Spinner) findViewById(R.id.spinner4);
        confirmar = (Button) findViewById(R.id.confirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner4.getSelectedItem()).equalsIgnoreCase("else if")){
                    findViewById(R.id.wink).setVisibility(View.VISIBLE);
                    findViewById(R.id.correto).setVisibility(View.VISIBLE);
                    findViewById(R.id.prox).setVisibility(View.VISIBLE);
                    findViewById(R.id.confirmar).setVisibility(View.GONE);
                    findViewById(R.id.ativ).setVisibility(View.GONE);
                    findViewById(R.id.spinner4).setVisibility(View.GONE);
                    findViewById(R.id.textView275).setVisibility(View.GONE);

                }else{
                    findViewById(R.id.titErrado).setVisibility(View.VISIBLE);
                    findViewById(R.id.errado).setVisibility(View.VISIBLE);
                    findViewById(R.id.prox).setVisibility(View.VISIBLE);
                    findViewById(R.id.confirmar).setVisibility(View.GONE);
                    findViewById(R.id.ativ).setVisibility(View.GONE);
                    findViewById(R.id.spinner4).setVisibility(View.GONE);
                    findViewById(R.id.textView275).setVisibility(View.GONE);
                    findViewById(R.id.errado).setVisibility(View.VISIBLE);
                }

            }

        });
    }

}
