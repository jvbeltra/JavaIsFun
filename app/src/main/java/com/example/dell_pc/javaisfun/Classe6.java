package com.example.dell_pc.javaisfun;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class Classe6 extends AppCompatActivity {
    int cont = 0;
    int contAct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe6);
        findViewById(R.id.txtCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.txtErrado).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton78).setVisibility(View.INVISIBLE);

    }

    public void checar(View view) {
        EditText edText1 = (EditText) findViewById(R.id.edText1);
        EditText edText2 = (EditText) findViewById(R.id.edText2);
        EditText edText3 = (EditText) findViewById(R.id.edText3);
        EditText edText4 = (EditText) findViewById(R.id.edText4);
        EditText edText5 = (EditText) findViewById(R.id.edText5);
        EditText edText6 = (EditText) findViewById(R.id.edText6);
        if (edText1.getText().toString().equals("class")
                && edText2.getText().toString().equals("int")
                && edText3.getText().toString().equals("String")
                && edText4.getText().toString().equals("double")
                && edText5.getText().toString().equals("void") &&
                edText6.getText().toString().equals("+")) {
            findViewById(R.id.txtCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.txtErrado).setVisibility(View.GONE);

        } else {
            findViewById(R.id.txtCorreto).setVisibility(View.GONE);
            findViewById(R.id.txtErrado).setVisibility(View.VISIBLE);

        }
    }
}




