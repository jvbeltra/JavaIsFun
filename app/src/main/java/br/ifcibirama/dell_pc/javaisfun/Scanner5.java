package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Scanner5 extends AppCompatActivity {
    EditText edit_text;
    EditText edit_text2;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Scanner4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner5);
        findViewById(R.id.titErrado).setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton7).setVisibility(View.INVISIBLE);
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
                        Intent intent = new Intent(Scanner5.this, MainActivity.class);
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
        edit_text = (EditText) findViewById(R.id.editText2);
        edit_text2 = (EditText) findViewById(R.id.editText10);
        //trim().replaceAll(" +", " ");
        String stringaux = edit_text.getText().toString();
        String stringaux2 = edit_text2.getText().toString();
        String input1 = stringaux.trim().replaceAll("\\s+", " ");
        String input2 = stringaux2.trim().replaceAll("\\s+", " ");

        if ((input1.equals("Scanner s = new Scanner(System.in);")
                || input1.equals("Scanner s= new Scanner(System.in);")

                || input1.equals("Scanner s =new Scanner(System.in);")
                || input1.equals("Scanner s=new Scanner(System.in);"))
                && (input2.equals("int idade = s.nextInt();")
                || input2.equals("int idade =s.nextInt();")
                || input2.equals("int idade=s.nextInt();")
                || input2.equals("int idade= s.nextInt();"))) {
            findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.wink).setVisibility(View.VISIBLE);
            findViewById(R.id.textView359).setVisibility(View.GONE);
            findViewById(R.id.textView358).setVisibility(View.GONE);
            findViewById(R.id.imageButton7).setVisibility(View.VISIBLE);
            findViewById(R.id.editText2).setVisibility(View.GONE);
            findViewById(R.id.editText10).setVisibility(View.GONE);
            findViewById(R.id.button4).setVisibility(View.GONE);
            findViewById(R.id.sysoutIdade).setVisibility(View.GONE);


        } else

        {
            findViewById(R.id.titErrado).setVisibility(View.VISIBLE);
            findViewById(R.id.textView359).setVisibility(View.GONE);
            findViewById(R.id.textView358).setVisibility(View.GONE);
            findViewById(R.id.imageButton7).setVisibility(View.VISIBLE);
            findViewById(R.id.editText2).setVisibility(View.GONE);
            findViewById(R.id.editText10).setVisibility(View.GONE);
            findViewById(R.id.button4).setVisibility(View.GONE);
            findViewById(R.id.sysoutIdade).setVisibility(View.GONE);
            findViewById(R.id.solucaoScanner).setVisibility(View.VISIBLE);
        }


    }

    public void next(View view) {
        Intent intent = new Intent(this, Scanner6.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
}
