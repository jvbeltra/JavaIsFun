package com.example.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Scanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

    }

    public void TextDialog(View view) {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Scanner.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void ChecarScanner(View view) {
        EditText edit_text = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView);
        if (edit_text.getText().toString().equals("Scanner s = new Scanner(System.in);") || edit_text.getText().toString().equals("Scanner s= new Scanner(System.in);") || edit_text.getText().toString().equals("Scanner s=new Scanner(System.in);") || edit_text.getText().toString().equals("Scanner s=new Scanner(System.in);")) {
            textView.setText("Correto!");
        } else if (edit_text.getText().toString().equals("Scanner S = new Scanner(System.in);") || edit_text.getText().toString().equals("Scanner S=new Scanner(System.in);") || edit_text.getText().toString().equals("Scanner S =new Scanner(System.in);")|| edit_text.getText().toString().equals("Scanner S= new Scanner(System.in);")){

            AlertDialog.Builder builder;

            builder = new AlertDialog.Builder(this);
            builder.setTitle("Aviso!")
                    .setMessage("Uma variável deve ser sempre declarada com a primeira letra minúscula.\nTente Scanner s = new Scanner(System.in)")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent2 = new Intent(Scanner.this, Scanner2.class);
                            startActivity(intent2);
                        }
                    })
                    .setNegativeButton("Tentar novamente", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    })
                    .setIcon(R.drawable.alert_ad)
                    .show();
        } else {
            textView.setText("Errado! Tente: Scanner s = new Scanner(System.in)");
        }


    }
}
