package br.ifcibirama.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Classe7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classe7);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    public void next(View view) {
        Intent intent = new Intent(this, Metodos.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
        finishAffinity();
    }
    public void homeBasic(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();
    }
}
