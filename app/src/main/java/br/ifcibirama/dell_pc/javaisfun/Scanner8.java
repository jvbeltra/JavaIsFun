package br.ifcibirama.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Scanner8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner8);
    }
    public void homeBasic(View view){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

    }
    public void nextexercise(View view){
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
}
