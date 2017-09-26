package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Condicao9 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }


    private Spinner spinner4;
    private Button confirmar;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao9);
        setTitle("Condições");
        verificarSpinner();
        findViewById(R.id.wink).setVisibility(View.INVISIBLE);
        findViewById(R.id.correto).setVisibility(View.INVISIBLE);
        findViewById(R.id.prox).setVisibility(View.INVISIBLE);
        findViewById(R.id.errado).setVisibility(View.INVISIBLE);
        findViewById(R.id.titErrado).setVisibility(View.INVISIBLE);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back_green, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, Condicao10.class);
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
                                Intent intent = new Intent(Condicao9.this, MainActivity.class);
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
                Intent intent2 = new Intent(this, Condicao8.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
    public void addListenerOnSpinnerItemSelection() {
        spinner4 = (Spinner) findViewById(R.id.spinner4);

    }

    public void verificarSpinner() {
        imageView = (ImageView) findViewById(R.id.wink);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        confirmar = (Button) findViewById(R.id.confirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner4.getSelectedItem()).equalsIgnoreCase("else if")){
                    findViewById(R.id.correto).setVisibility(View.VISIBLE);
                    findViewById(R.id.prox).setVisibility(View.VISIBLE);
                    findViewById(R.id.confirmar).setVisibility(View.GONE);
                    findViewById(R.id.ativ).setVisibility(View.GONE);
                    findViewById(R.id.spinner4).setVisibility(View.GONE);
                    findViewById(R.id.textView275).setVisibility(View.GONE);
                    imageView.setImageResource(R.drawable.happy);
                    imageView.setVisibility(View.VISIBLE);

                }else{
                    findViewById(R.id.titErrado).setVisibility(View.VISIBLE);
                    findViewById(R.id.errado).setVisibility(View.VISIBLE);
                    findViewById(R.id.prox).setVisibility(View.VISIBLE);
                    findViewById(R.id.confirmar).setVisibility(View.GONE);
                    findViewById(R.id.ativ).setVisibility(View.GONE);
                    findViewById(R.id.spinner4).setVisibility(View.GONE);
                    findViewById(R.id.textView275).setVisibility(View.GONE);
                    findViewById(R.id.errado).setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.sad);
                    imageView.setVisibility(View.VISIBLE);
                }

            }

        });
    }

}
