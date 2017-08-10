package com.example.dell_pc.javaisfun;

import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void menu(View view){
        Intent intent = new Intent(this, MenuGear.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }



    public void TelaBasica(View view){
        Intent intent = new Intent(this, EasyActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }
    public void TelaIntermediaria(View view){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void TelaAvancada(View view){
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.up_in, R.anim.up_out);
    }
    public void AboutTheApp(View view){
        Intent intent = new Intent(this, AboutTheApp.class);
        startActivity(intent);
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void AboutUs(View view){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
    }

}
