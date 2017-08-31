package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class Scanner6 extends AppCompatActivity {

    EditText nome;
    EditText declaracao;
    EditText idade;
    EditText peso;
    EditText maioridade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner6);
        findViewById(R.id.textErrado).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton165).setVisibility(View.INVISIBLE);
        findViewById(R.id.solucaoScanner).setVisibility(View.INVISIBLE);
        findViewById(R.id.textCorreto).setVisibility(View.INVISIBLE);
        findViewById(R.id.wink).setVisibility(View.INVISIBLE);
    }


    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Scanner6.this, MainActivity.class);
                        startActivity(intent);
                        finishAffinity();
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

    public void ChecarScanner(View view) {
        nome = (EditText) findViewById(R.id.nome);
        idade = (EditText) findViewById(R.id.idade);
        peso = (EditText) findViewById(R.id.peso);
        declaracao = (EditText) findViewById(R.id.declaracao);
        maioridade = (EditText) findViewById(R.id.maioridade);
        String stringaux = nome.getText().toString();
        String stringaux2 = idade.getText().toString();
        String stringaux3 = peso.getText().toString();
        String stringaux4 = declaracao.getText().toString();
        String stringaux5 = maioridade.getText().toString();
        String input1 = stringaux.trim().replaceAll("\\s+", " ");
        String input2 = stringaux2.trim().replaceAll("\\s+", " ");
        String input3 = stringaux3.trim().replaceAll("\\s+", " ");
        String input4 = stringaux4.trim().replaceAll("\\s+", " ");
        String input5 = stringaux5.trim().replaceAll("\\s+", " ");

        if ((input4.equals("Scanner s = new Scanner(System.in);")
                || input4.equals("Scanner s= new Scanner(System.in);")
                || input4.equals("Scanner s =new Scanner(System.in);")
                || input4.equals("Scanner s=new Scanner(System.in);"))
                && (input2.equals("int idade = s.nextInt();")
                || input2.equals("int idade =s.nextInt();")
                || input2.equals("int idade=s.nextInt();")
                || input2.equals("int idade= s.nextInt();"))
                && (input3.equals("float peso = s.nextFloat();")
                || input3.equals("float peso =s.nextFloat();")
                || input3.equals("float peso=s.nextFloat();")
                || input3.equals("float peso= s.nextFloat();"))
                && (input5.equals("boolean maioridade= s.nextBoolean();")
                || input5.equals("boolean maioridade =s.nextBoolean();")
                || input5.equals("boolean maioridade=s.nextBoolean();")
                || input5.equals("boolean maioridade = s.nextBoolean();"))
                && (input1.equals("String nome= s.next();")
                || input1.equals("String nome =s.next();")
                || input1.equals("String nome=s.next();")
                || input1.equals("String nome = s.next();"))
                ) {
            findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.wink).setVisibility(View.VISIBLE);
            findViewById(R.id.enunciado).setVisibility(View.GONE);
            findViewById(R.id.imageButton165).setVisibility(View.VISIBLE);
            findViewById(R.id.nome).setVisibility(View.GONE);
            findViewById(R.id.idade).setVisibility(View.GONE);
            findViewById(R.id.maioridade).setVisibility(View.GONE);
            findViewById(R.id.peso).setVisibility(View.GONE);
            findViewById(R.id.declaracao).setVisibility(View.GONE);
            findViewById(R.id.button37).setVisibility(View.GONE);
            findViewById(R.id.atividade).setVisibility(View.GONE);


        } else

        {
            findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
            findViewById(R.id.enunciado).setVisibility(View.GONE);
            findViewById(R.id.imageButton165).setVisibility(View.VISIBLE);
            findViewById(R.id.nome).setVisibility(View.GONE);
            findViewById(R.id.idade).setVisibility(View.GONE);
            findViewById(R.id.declaracao).setVisibility(View.GONE);
            findViewById(R.id.peso).setVisibility(View.GONE);
            findViewById(R.id.maioridade).setVisibility(View.GONE);
            findViewById(R.id.atividade).setVisibility(View.GONE);
            findViewById(R.id.solucaoScanner).setVisibility(View.VISIBLE);
            findViewById(R.id.button37).setVisibility(View.GONE);
        }



    }


    public void next(View view) {
        Intent intent = new Intent(this, Scanner7.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
}


