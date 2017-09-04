package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Vetores11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetores11);
        findViewById(R.id.imageButton153).setVisibility(View.GONE);
        findViewById(R.id.textView333).setVisibility(View.GONE);
        findViewById(R.id.textView337).setVisibility(View.GONE);
        findViewById(R.id.imageView70).setVisibility(View.GONE);

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
                        Intent intent = new Intent(Vetores11.this, MainActivity.class);
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
        Intent intent = new Intent(this, Vetores12.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void verificar(View view){
        EditText editText = (EditText) findViewById(R.id.editText4);
        EditText editText2 = (EditText) findViewById(R.id.editText8);
        EditText editText3 = (EditText) findViewById(R.id.editText7);
        ImageView imageView = (ImageView) findViewById(R.id.imageView70);

        if(editText.getText().toString().equalsIgnoreCase("vetor.length")&& editText2.getText().toString().equalsIgnoreCase("5") && editText3.getText().toString().equalsIgnoreCase("++;")){
            findViewById(R.id.imageButton153).setVisibility(View.VISIBLE);
            findViewById(R.id.textView333).setVisibility(View.VISIBLE);
            findViewById(R.id.textView337).setVisibility(View.GONE);
            findViewById(R.id.button35).setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.checkmarkred);

            imageView.setVisibility(View.VISIBLE);
        }else{
            findViewById(R.id.textView333).setVisibility(View.GONE);
            findViewById(R.id.textView337).setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.sad);
            imageView.setVisibility(View.VISIBLE);
        }
    }
}
