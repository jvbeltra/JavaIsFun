package br.ifcibirama.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Objetos7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetos7);
    }
    public void homeBasic(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();

    }
}
