package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class  Variaveis4 extends AppCompatActivity {
    private Spinner spinner2;
    private Button btnSubmit;
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variaveis4);
        verificarSpinner();
        addListenerOnSpinnerItemSelection();
        findViewById(R.id.imageView2).setVisibility(View.GONE);
        findViewById(R.id.textView13).setVisibility(View.GONE);
        findViewById(R.id.textView14).setVisibility(View.GONE);
        findViewById(R.id.imageButton2).setVisibility(View.GONE);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Variaveis4.this, MainActivity.class);
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
        spinner2 = (Spinner) findViewById(R.id.spinner2);

    }



    public void next(View view){
        Intent intent = new Intent(this, Variaveis5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void verificarSpinner() {


        spinner2 = (Spinner) findViewById(R.id.spinner2);
        btnSubmit = (Button) findViewById(R.id.button5);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner2.getSelectedItem()).equalsIgnoreCase("String")){
                    findViewById(R.id.imageView2).setVisibility(View.VISIBLE);
                    findViewById(R.id.textView13).setVisibility(View.VISIBLE);
                    findViewById(R.id.textView14).setVisibility(View.GONE);
                    findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
                    findViewById(R.id.button5).setVisibility(View.GONE);
                }else{
                    findViewById(R.id.textView14).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageView2).setVisibility(View.GONE);
                    findViewById(R.id.textView13).setVisibility(View.GONE);
                    findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
                }

            }

        });
    }
}
