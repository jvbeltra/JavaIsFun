package com.example.dell_pc.javaisfun;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class Classe6 extends AppCompatActivity {
    int cont = 0;

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
        InputMethodManager inputManager =
                (InputMethodManager)
                        context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(
                this.getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
        if (edText1.getText().toString().equals("Class")) {
            cont++;
        }
        EditText edText2 = (EditText) findViewById(R.id.edText2);
        if (edText2.getText().toString().equals("int")) {
            cont++;
        }
        EditText edText3 = (EditText) findViewById(R.id.edText3);
        if (edText3.getText().toString().equals("String")) {
            cont++;
        }

        EditText edText4 = (EditText) findViewById(R.id.edText4);
        if (edText4.getText().toString().equals("double")) {
            cont++;
        }

        EditText edText5 = (EditText) findViewById(R.id.edText5);
        if (edText5.getText().toString().equals("void")) {
            cont++;
        }

        EditText edText6 = (EditText) findViewById(R.id.edText6);
        if (edText6.getText().toString().equals("+")) {
            cont++;
        }
        if (cont == 6) {
            findViewById(R.id.txtCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton78).setVisibility(View.VISIBLE);

        } else if(cont!=6) {
            findViewById(R.id.txtCorreto).setVisibility(View.GONE);
            findViewById(R.id.txtErrado).setVisibility(View.VISIBLE);
            cont = 0;
        }
    }
}


