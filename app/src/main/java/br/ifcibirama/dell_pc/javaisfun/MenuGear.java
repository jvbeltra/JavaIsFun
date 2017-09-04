package br.ifcibirama.dell_pc.javaisfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuGear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_gear);

        findViewById(R.id.textView233).setOnClickListener(onClickNotify);

    }
    public void back(View view){
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }


    View.OnClickListener onClickNotify = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MenuGear.this, Notificacoes.class);
            startActivity(intent);
            overridePendingTransition(R.anim.left_in, R.anim.left_out);
        }
    };
}
