package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Matrizes7 extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;
    EditText ed7;
    EditText ed8;
    EditText ed9;
    EditText ed10;
    EditText ed11;


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrizes7);
        setTitle("Matrizes");
        findViewById(R.id.textCorreto).setVisibility(View.GONE);
        findViewById(R.id.textErrado).setVisibility(View.GONE);
        findViewById(R.id.wink).setVisibility(View.GONE);
        findViewById(R.id.imageButton191).setVisibility(View.GONE);

    }



    public void checar(View view) {

        ImageView imageView = (ImageView) findViewById(R.id.wink);

        ed1 = (EditText) findViewById(R.id.editText11);
        ed2 = (EditText) findViewById(R.id.editText12);
        ed3 = (EditText) findViewById(R.id.editText13);
        ed4 = (EditText) findViewById(R.id.editText14);
        ed5 = (EditText) findViewById(R.id.editText15);
        ed6 = (EditText) findViewById(R.id.editText16);
        ed7 = (EditText) findViewById(R.id.editText17);
        ed8 = (EditText) findViewById(R.id.editText18);
        ed9 = (EditText) findViewById(R.id.editText19);
        ed10 = (EditText) findViewById(R.id.editText20);
        ed11 = (EditText) findViewById(R.id.editText21);
        String stringaux = ed1.getText().toString();
        String stringaux2 = ed2.getText().toString();
        String stringaux3 = ed3.getText().toString();
        String stringaux4 = ed4.getText().toString();
        String stringaux5 = ed5.getText().toString();
        String stringaux6 = ed6.getText().toString();
        String stringaux7 = ed7.getText().toString();
        String stringaux8 = ed8.getText().toString();
        String stringaux9 = ed9.getText().toString();
        String stringaux10 = ed10.getText().toString();
        String stringaux11 = ed11.getText().toString();
        String input1 = stringaux.trim().replaceAll("\\s+", " ");
        String input2 = stringaux2.trim().replaceAll("\\s+", " ");
        String input3 = stringaux3.trim().replaceAll("\\s+", " ");
        String input4 = stringaux4.trim().replaceAll("\\s+", " ");
        String input5 = stringaux5.trim().replaceAll("\\s+", " ");
        String input6 = stringaux6.trim().replaceAll("\\s+", " ");
        String input7 = stringaux7.trim().replaceAll("\\s+", " ");
        String input8 = stringaux8.trim().replaceAll("\\s+", " ");
        String input9 = stringaux9.trim().replaceAll("\\s+", " ");
        String input10 = stringaux10.trim().replaceAll("\\s+", " ");
        String input11 = stringaux11.trim().replaceAll("\\s+", " ");

        if (
                input1.equals("i")
                        && input2.equals("i")
                        && input3.equals("4")
                        && input4.equals("i")
                        && input5.equals("j")
                        && input6.equals("j")
                        && input7.equals("2")
                        && input8.equals("j")
                        && input9.equals("i")
                        && input10.equals("j")
                        && input11.equals("5")
                ) {
            findViewById(R.id.textCorreto).setVisibility(View.VISIBLE);
            findViewById(R.id.textErrado).setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.happy);
            imageView.setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton191).setVisibility(View.VISIBLE);


        } else

        {
            findViewById(R.id.textCorreto).setVisibility(View.GONE);
            findViewById(R.id.textErrado).setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton191).setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.sad);
            imageView.setVisibility(View.VISIBLE);
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back_red, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, Matrizes8.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finishAffinity();
                return true;

            case R.id.menu_home:
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(this);

                builder.setTitle("Home")
                        .setMessage("Você tem certeza que quer voltar ao menu principal?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Matrizes7.this, MainActivity.class);
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
                return true;
            case R.id.menu_back:
                Intent intent2 = new Intent(this, Matrizes6.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
